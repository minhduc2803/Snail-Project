package bla.nah.example.da;

import bla.nah.example.model.Chat;
import bla.nah.example.model.Conversation;
import bla.nah.example.model.ConversationMember;
import bla.nah.example.model.User;
import bla.nah.example.utils.AsyncHandler;
import io.vertx.core.Future;

import javax.sql.DataSource;
import java.sql.SQLException;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class ConversationDAImpl extends BaseTransactionDA implements ConversationDA{
    private final DataSource dataSource;
    private final AsyncHandler asyncHandler;

    private static final String INSERT_CONVERSATION_STATEMENT = "INSERT INTO `chatapp`.`Conversation` (`UserStartID`, `Mode`) VALUES (?, ?);";
    private static final String SELECT_CONVERSATION_BY_START_USER = "";

    public ConversationDAImpl(DataSource dataSource, AsyncHandler asyncHandler) {
        super();
        this.dataSource = dataSource;
        this.asyncHandler = asyncHandler;
    }

    @Override
    public Executable<Conversation> insert(Conversation conversation) {
        log.info("MYSQL: INSERTING A NEW CONVERSATION");
        return connection -> {
            Future<Conversation> future = Future.future();
            Future<Void> temp = Future.future();
            asyncHandler.run(
                    () -> {
                        Object[] params = {conversation.getUserStartID(), conversation.getMode()};
                        try {
                            boolean isSuccess = executeWithParams(
                                    temp, connection.unwrap(), INSERT_CONVERSATION_STATEMENT, params, "insertChat");
                            if(isSuccess){
                                future.complete(conversation);
                            }else{
                                future.fail("Wrong Insert Statement");
                            }
                        } catch (SQLException e) {
                            future.fail(e);
                        }
                    });
            return future;
        };
    }

    @Override
    public Future<Conversation> selectUserByUserStartId(int id) {
        return null;
    }
}
