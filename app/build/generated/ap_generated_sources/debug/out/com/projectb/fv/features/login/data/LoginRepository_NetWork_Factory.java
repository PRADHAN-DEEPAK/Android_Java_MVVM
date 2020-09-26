package com.projectb.fv.features.login.data;

import com.projectb.fv.core.network.NetworkHandler;
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
public final class LoginRepository_NetWork_Factory implements Factory<LoginRepository.NetWork> {
  private final Provider<NetworkHandler> networkHandlerProvider;

  private final Provider<LoginService> loginServiceProvider;

  public LoginRepository_NetWork_Factory(Provider<NetworkHandler> networkHandlerProvider,
      Provider<LoginService> loginServiceProvider) {
    this.networkHandlerProvider = networkHandlerProvider;
    this.loginServiceProvider = loginServiceProvider;
  }

  @Override
  public LoginRepository.NetWork get() {
    return newInstance(networkHandlerProvider.get(), loginServiceProvider.get());
  }

  public static LoginRepository_NetWork_Factory create(
      Provider<NetworkHandler> networkHandlerProvider,
      Provider<LoginService> loginServiceProvider) {
    return new LoginRepository_NetWork_Factory(networkHandlerProvider, loginServiceProvider);
  }

  public static LoginRepository.NetWork newInstance(NetworkHandler networkHandler,
      LoginService loginService) {
    return new LoginRepository.NetWork(networkHandler, loginService);
  }
}
