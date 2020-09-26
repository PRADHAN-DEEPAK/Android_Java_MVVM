package com.projectb.fv.core.injection.module;

import com.projectb.fv.core.storage.DemoPreference;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
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
public final class StorageModule_ProvideSharedPreferencesFactory implements Factory<DemoPreference> {
  private final StorageModule module;

  private final Provider<DemoPreference.Preference> dataProvider;

  public StorageModule_ProvideSharedPreferencesFactory(StorageModule module,
      Provider<DemoPreference.Preference> dataProvider) {
    this.module = module;
    this.dataProvider = dataProvider;
  }

  @Override
  public DemoPreference get() {
    return provideSharedPreferences(module, dataProvider.get());
  }

  public static StorageModule_ProvideSharedPreferencesFactory create(StorageModule module,
      Provider<DemoPreference.Preference> dataProvider) {
    return new StorageModule_ProvideSharedPreferencesFactory(module, dataProvider);
  }

  public static DemoPreference provideSharedPreferences(StorageModule instance,
      DemoPreference.Preference data) {
    return Preconditions.checkNotNull(instance.provideSharedPreferences(data), "Cannot return null from a non-@Nullable @Provides method");
  }
}
