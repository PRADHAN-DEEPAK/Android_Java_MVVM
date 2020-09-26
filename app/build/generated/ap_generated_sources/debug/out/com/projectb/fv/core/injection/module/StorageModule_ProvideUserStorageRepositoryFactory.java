package com.projectb.fv.core.injection.module;

import com.projectb.fv.features.login.data.UserStorageRepository;
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
public final class StorageModule_ProvideUserStorageRepositoryFactory implements Factory<UserStorageRepository> {
  private final StorageModule module;

  private final Provider<UserStorageRepository.Database> sourceProvider;

  public StorageModule_ProvideUserStorageRepositoryFactory(StorageModule module,
      Provider<UserStorageRepository.Database> sourceProvider) {
    this.module = module;
    this.sourceProvider = sourceProvider;
  }

  @Override
  public UserStorageRepository get() {
    return provideUserStorageRepository(module, sourceProvider.get());
  }

  public static StorageModule_ProvideUserStorageRepositoryFactory create(StorageModule module,
      Provider<UserStorageRepository.Database> sourceProvider) {
    return new StorageModule_ProvideUserStorageRepositoryFactory(module, sourceProvider);
  }

  public static UserStorageRepository provideUserStorageRepository(StorageModule instance,
      UserStorageRepository.Database source) {
    return Preconditions.checkNotNull(instance.provideUserStorageRepository(source), "Cannot return null from a non-@Nullable @Provides method");
  }
}
