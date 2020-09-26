package com.projectb.fv.core.injection.module;

import android.content.Context;
import com.projectb.fv.core.storage.DemoDatabase;
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
public final class StorageModule_ProvideDemoDatabaseFactory implements Factory<DemoDatabase> {
  private final StorageModule module;

  private final Provider<Context> contextProvider;

  public StorageModule_ProvideDemoDatabaseFactory(StorageModule module,
      Provider<Context> contextProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
  }

  @Override
  public DemoDatabase get() {
    return provideDemoDatabase(module, contextProvider.get());
  }

  public static StorageModule_ProvideDemoDatabaseFactory create(StorageModule module,
      Provider<Context> contextProvider) {
    return new StorageModule_ProvideDemoDatabaseFactory(module, contextProvider);
  }

  public static DemoDatabase provideDemoDatabase(StorageModule instance, Context context) {
    return Preconditions.checkNotNull(instance.provideDemoDatabase(context), "Cannot return null from a non-@Nullable @Provides method");
  }
}
