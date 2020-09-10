package bla.nah.example.da;

import bla.nah.example.model.User;
import bla.nah.example.utils.ExceptionUtil;
import bla.nah.example.utils.JsonProtoUtils;
import io.vertx.core.Future;
import io.vertx.core.json.JsonArray;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.lang.invoke.MethodHandles;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class BaseTransactionDA extends BaseDA {
  private static final Logger LOGGER =
      LogManager.getLogger(MethodHandles.lookup().lookupClass().getCanonicalName());
  protected static final Object[] EMPTY_PARAMS = {};
  protected static final SQLException EXCEPTION_CONNECTION_NULL =
      new SQLException("provide connection is NULL");

  public BaseTransactionDA() {
    super();
  }

  public BaseTransactionDA(int statementTimeoutSec) {
    super(statementTimeoutSec);
  }

  protected boolean executeWithParams(
          Future<Void> result, Connection connection, String stm, Object[] params, String method)
          throws SQLException {

    PreparedStatement preparedStatement = null;
    try {
      preparedStatement = connection.prepareStatement(stm);
      preparedStatement.setQueryTimeout(statementTimeoutSec);

      setParamsFromArray(preparedStatement, params);
      int affectedRow = preparedStatement.executeUpdate();

      if (1 != affectedRow) {
        log.info("Failed");
        String reason =
                String.format(
                        "%s wrong effected row expected=1, actual=%d, query=%s, params=%s",
                        method, affectedRow, stm, JsonProtoUtils.printGson(params));
        result.fail("Invalid statement");
        return false;
      } else {
        log.info("Successful");
        result.complete();
        return true;
      }
    } finally {
      closeResource(LOGGER, preparedStatement);
    }
  }


  protected int executeWithParams(Connection connection, String stm, Object[] params, String method)
      throws SQLException {
    return executeWithParams(connection, stm, params, method, 1);
  }

  protected int executeWithParams(
      Connection connection, String stm, Object[] params, String method, int expectedValue)
      throws SQLException {
    int affectedRow = executeQueryWithParams(connection, stm, params, method);

    if (-1 != expectedValue && affectedRow != expectedValue) {
      throw new SQLException(
          method
              + " wrong effected row expected="
              + expectedValue
              + ", actual="
              + affectedRow
              + " query="
              + stm
              + " params="
              + JsonProtoUtils.printGson(params));
    }

    return affectedRow;
  }

  protected int executeQueryWithParams(
      Connection connection, String stm, Object[] params, String method) throws SQLException {
    int affectedRow = 0;
    PreparedStatement preparedStatement = null;
    try {
      preparedStatement = connection.prepareStatement(stm);
      preparedStatement.setQueryTimeout(statementTimeoutSec);

      setParamsFromArray(preparedStatement, params);
      affectedRow = preparedStatement.executeUpdate();
    } finally {
      closeResource(LOGGER, preparedStatement);
    }

    return affectedRow;
  }

  protected <T> void queryEntity(
      String method,
      Future<T> result,
      String query,
      JsonArray params,
      FunctionEx<ResultSet, T> mapper,
      SupplierEx<Connection> connectionSupplier,
      boolean isTransaction) {
    Connection connection = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;
    try {
      connection = connectionSupplier.get();
      if (connection == null) {
        throw EXCEPTION_CONNECTION_NULL;
      }

      preparedStatement = connection.prepareStatement(query);
      preparedStatement.setQueryTimeout(statementTimeoutSec);
      setParamsFromJsonArray(preparedStatement, params);
      resultSet = preparedStatement.executeQuery();

      T data = mapper.apply(resultSet);

      result.complete(data);
    } catch (Exception e) {
      LOGGER.warn("Failed execute cause={}", ExceptionUtil.getDetail(e));
      result.fail(e);
    } finally {
      if (!isTransaction) {
        closeResource(LOGGER, resultSet, preparedStatement, connection);
      } else {
        closeResource(LOGGER, resultSet, preparedStatement);
      }
    }
  }

  protected <T> void queryEntity(
      String method,
      Future<T> result,
      String query,
      Object[] params,
      FunctionEx<ResultSet, T> mapper,
      SupplierEx<Connection> connectionSupplier,
      boolean isTransaction) {
    Connection connection = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;
    try {
      connection = connectionSupplier.get();
      if (connection == null) {
        throw EXCEPTION_CONNECTION_NULL;
      }

      preparedStatement = connection.prepareStatement(query);
      preparedStatement.setQueryTimeout(statementTimeoutSec);
      setParamsFromArray(preparedStatement, params);
      resultSet = preparedStatement.executeQuery();

      T data = mapper.apply(resultSet);

      result.complete(data);
    } catch (Exception e) {
      LOGGER.warn("Failed execute cause={}", ExceptionUtil.getDetail(e));
      result.fail(e);
    } finally {
      if (!isTransaction) {
        closeResource(LOGGER, resultSet, preparedStatement, connection);
      } else {
        closeResource(LOGGER, resultSet, preparedStatement);
      }
    }
  }

  protected <T> T queryEntity(
      String method,
      String query,
      JsonArray params,
      FunctionEx<ResultSet, T> mapper,
      SupplierEx<Connection> connectionSupplier,
      boolean isTransaction)
      throws Exception {
    return queryEntity(
        method, query, params.getList().toArray(), mapper, connectionSupplier, isTransaction);
  }

  protected <T> T queryEntity(
      String method,
      String query,
      Object[] params,
      FunctionEx<ResultSet, T> mapper,
      SupplierEx<Connection> connectionSupplier,
      boolean isTransaction)
      throws Exception {
    T result;
    Connection connection = null;

    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;
    try {
      connection = connectionSupplier.get();
      if (connection == null) {
        throw EXCEPTION_CONNECTION_NULL;
      }

      preparedStatement = connection.prepareStatement(query);
      preparedStatement.setQueryTimeout(statementTimeoutSec);
      setParamsFromArray(preparedStatement, params);
      resultSet = preparedStatement.executeQuery();
      result = mapper.apply(resultSet);
    } finally {
      if (!isTransaction) {
        closeResource(LOGGER, resultSet, preparedStatement, connection);
      } else {
        closeResource(LOGGER, resultSet, preparedStatement);
      }
    }
    return result;
  }
}
