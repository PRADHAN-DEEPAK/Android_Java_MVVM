package com.projectb.fv.features.login.ui;

import com.projectb.fv.features.login.data.LoginRepository;
import com.projectb.fv.features.login.data.UserStorageRepository;
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
public final class LoginViewModel_Factory implements Factory<LoginViewModel> {
  private final Provider<LoginRepository> loginRepositoryProvider;

  private final Provider<UserStorageRepository> userStorageRepositoryProvider;

  public LoginViewModel_Factory(Provider<LoginRepository> loginRepositoryProvider,
      Provider<UserStorageRepository> userStorageRepositoryProvider) {
    this.loginRepositoryProvider = loginRepositoryProvider;
    this.userStorageRepositoryProvider = userStorageRepositoryProvider;
  }

  @Override
  public LoginViewModel get() {
    return newInstance(loginRepositoryProvider.get(), userStorageRepositoryProvider.get());
  }

  public static LoginViewModel_Factory create(Provider<LoginRepository> loginRepositoryProvider,
      Provider<UserStorageRepository> userStorageRepositoryProvider) {
    return new LoginViewModel_Factory(loginRepositoryProvider, userStorageRepositoryProvider);
  }

  public static LoginViewModel newInstance(LoginRepository loginRepository,
      UserStorageRepository userStorageRepository) {
    return new LoginViewModel(loginRepository, userStorageRepository);
  }
}
