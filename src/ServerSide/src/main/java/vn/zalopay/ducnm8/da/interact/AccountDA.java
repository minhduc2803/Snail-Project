package vn.zalopay.ducnm8.da.interact;

import io.vertx.core.Future;
import vn.zalopay.ducnm8.da.Executable;
import vn.zalopay.ducnm8.model.Account;
import vn.zalopay.ducnm8.model.Balance;
import vn.zalopay.ducnm8.model.User;
import vn.zalopay.ducnm8.model.UserWithoutPassword;

import java.util.ArrayList;

public interface AccountDA {
  Executable<Long> insert(Account account);

  Future<User> selectUserById(long id);

  Future<User> selectUserByUsername(String Username);

  Future<ArrayList<UserWithoutPassword>> selectUserList(long id);

  Future<Balance> selectBalanceById(long id);

  Executable<Long> plusBalanceByAmount(long id, long amount);

  Executable<Long> updateNumberNotification(long id, int number);
}
