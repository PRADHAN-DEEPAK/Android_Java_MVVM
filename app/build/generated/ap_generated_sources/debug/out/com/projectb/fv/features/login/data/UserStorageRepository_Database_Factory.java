package com.projectb.fv.features.login.data;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class UserStorageRepository_Database_Factory implements Factory<UserStorageRepository.Database> {
  private final Provider<UserDao> userDaoProvider;

  public UserStorageRepository_Database_Factory(Provider<UserDao> userDaoProvider) {
    this.userDaoProvider = userDaoProvider;
  }

  @Override
  public UserStorageRepository.Database get() {
    return newInstance(userDaoProvider.get());
  }

  public static UserStorageRepository_Database_Factory create(Provider<UserDao> userDaoProvider) {
    return new UserStorageRepository_Database_Factory(userDaoProvider);
  }

  public static UserStorageRepository.Database newInstance(UserDao userDao) {
    return new UserStorageRepository.Database(userDao);
  }
}
