package com.projectb.fv.features.login.data;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import retrofit2.Retrofit;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class LoginService_Factory implements Factory<LoginService> {
  private final Provider<Retrofit> retrofitProvider;

  public LoginService_Factory(Provider<Retrofit> retrofitProvider) {
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public LoginService get() {
    return newInstance(retrofitProvider.get());
  }

  public static LoginService_Factory create(Provider<Retrofit> retrofitProvider) {
    return new LoginService_Factory(retrofitProvider);
  }

  public static LoginService newInstance(Retrofit retrofit) {
    return new LoginService(retrofit);
  }
}
