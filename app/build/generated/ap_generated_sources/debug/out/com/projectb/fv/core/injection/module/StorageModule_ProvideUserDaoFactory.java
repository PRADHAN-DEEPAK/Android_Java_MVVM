package com.projectb.fv.core.injection.module;

import com.projectb.fv.core.storage.DemoDatabase;
import com.projectb.fv.features.login.data.UserDao;
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
public final class StorageModule_ProvideUserDaoFactory implements Factory<UserDao> {
  private final StorageModule module;

  private final Provider<DemoDatabase> databaseProvider;

  public StorageModule_ProvideUserDaoFactory(StorageModule module,
      Provider<DemoDatabase> databaseProvider) {
    this.module = module;
    this.databaseProvider = databaseProvider;
  }

  @Override
  public UserDao get() {
    return provideUserDao(module, databaseProvider.get());
  }

  public static StorageModule_ProvideUserDaoFactory create(StorageModule module,
      Provider<DemoDatabase> databaseProvider) {
    return new StorageModule_ProvideUserDaoFactory(module, databaseProvider);
  }

  public static UserDao provideUserDao(StorageModule instance, DemoDatabase database) {
    return Preconditions.checkNotNull(instance.provideUserDao(database), "Cannot return null from a non-@Nullable @Provides method");
  }
}
