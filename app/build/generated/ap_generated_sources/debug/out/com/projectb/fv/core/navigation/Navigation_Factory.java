package com.projectb.fv.core.navigation;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class Navigation_Factory implements Factory<Navigation> {
  @Override
  public Navigation get() {
    return newInstance();
  }

  public static Navigation_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static Navigation newInstance() {
    return new Navigation();
  }

  private static final class InstanceHolder {
    private static final Navigation_Factory INSTANCE = new Navigation_Factory();
  }
}
