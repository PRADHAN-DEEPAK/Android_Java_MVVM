package com.projectb.fv.core.storage;

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
public final class DemoPreference_Preference_Factory implements Factory<DemoPreference.Preference> {
  private final Provider<Context> contextProvider;

  public DemoPreference_Preference_Factory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public DemoPreference.Preference get() {
    return newInstance(contextProvider.get());
  }

  public static DemoPreference_Preference_Factory create(Provider<Context> contextProvider) {
    return new DemoPreference_Preference_Factory(contextProvider);
  }

  public static DemoPreference.Preference newInstance(Context context) {
    return new DemoPreference.Preference(context);
  }
}
