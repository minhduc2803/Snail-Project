package vn.zalopay.ducnm8.da.interact;

import io.vertx.core.Future;
import org.apache.logging.log4j.Logger;
import vn.zalopay.ducnm8.common.mapper.EntityMapper;
import vn.zalopay.ducnm8.da.BaseTransactionDA;
import vn.zalopay.ducnm8.da.Executable;
import vn.zalopay.ducnm8.model.TransferHistory;
import vn.zalopay.ducnm8.utils.AsyncHandler;
import vn.zalopay.ducnm8.utils.JsonProtoUtils;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class TransferHistoryDAImpl extends BaseTransactionDA implements TransferHistoryDA{
    private static final Logger log = org.apache.logging.log4j.LogManager.getLogger(AccountDAImpl.class);
    private final DataSource dataSource;
    private final AsyncHandler asyncHandler;
    private static final String INSERT_TRANSFER_HISTORY_STATEMENT =
            "INSERT INTO transfer_history (`transfer_id`,`user_id`,`partner_id`,`transfer_type`) VALUES (?, ?, ?, ?)";
    private static final String SELECT_TRANSFER_HISTORY_BY_ACCOUNT_ID =
            "SELECT H.id, H.transfer_id, H.user_id, H.partner_id, H.transfer_type,\n" +
            "T.amount, T.amount, T.message, T.transfer_time,\n" +
            "C.user_name, C.full_name\n" +
            "FROM transfer_history as H\n" +
            "INNER JOIN transfer as T\n" +
            "ON H.transfer_id = T.id\n" +
            "INNER JOIN account as C\n" +
            "ON H.partner_id = C.id\n" +
            "WHERE H.user_id = ?";
    public TransferHistoryDAImpl(DataSource dataSource, AsyncHandler asyncHandler) {
        this.dataSource = dataSource;
        this.asyncHandler = asyncHandler;
    }

    @Override
    public Executable<TransferHistory> insert(TransferHistory transferHistory) {
        log.info("insert a new transfer history");
        return connection -> {
            Future<TransferHistory> future = Future.future();
            asyncHandler.run(
                    () -> {
                        Object[] params = {transferHistory.getTransferId(), transferHistory.getUserId(), transferHistory.getPartnerId(), transferHistory.getTransferType()};
                        try {
                            long id = executeWithParamsAndGetId(connection.unwrap(), INSERT_TRANSFER_HISTORY_STATEMENT, params, "insertTransferHistory");
                            transferHistory.setId(id);
                            future.complete(transferHistory);

                        } catch (SQLException e) {
                            future.fail(e);
                            String reason = String.format("cannot insert a transfer history ~ cause: %s", e.getMessage());
                            log.error(reason);
                        }
                    });
            return future;
        };
    }

    @Override
    public Future<ArrayList<TransferHistory>> selectTransferHistoryByAccountId(long id) {
        log.info("select a list transfer history");
        Future<ArrayList<TransferHistory>> future = Future.future();
        asyncHandler.run(
                () -> {
                    Object[] params = {id};
                    queryEntity(
                            "queryTransferHistory",
                            future,
                            SELECT_TRANSFER_HISTORY_BY_ACCOUNT_ID,
                            params,
                            this::mapRs2EntityTransferHistory,
                            dataSource::getConnection,
                            false);
                });

        return future;
    }

    private ArrayList<TransferHistory> mapRs2EntityTransferHistory(ResultSet resultSet) throws Exception {
        TransferHistory transferHistory = null;
        ArrayList<TransferHistory> historyList = new ArrayList<>();
        while (resultSet.next()) {
            transferHistory = new TransferHistory();
            EntityMapper.getInstance().loadResultSetIntoObject(resultSet, transferHistory);
            historyList.add(transferHistory);
        }

        return historyList;
    }
}