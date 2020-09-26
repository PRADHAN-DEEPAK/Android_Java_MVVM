package com.projectb.fv.core.network;

import android.content.Context;
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
public final class NetworkHandler_Factory implements Factory<NetworkHandler> {
  private final Provider<Context> contextProvider;

  public NetworkHandler_Factory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public NetworkHandler get() {
    return newInstance(contextProvider.get());
  }

  public static NetworkHandler_Factory create(Provider<Context> contextProvider) {
    return new NetworkHandler_Factory(contextProvider);
  }

  public static NetworkHandler newInstance(Context context) {
    return new NetworkHandler(context);
  }
}
