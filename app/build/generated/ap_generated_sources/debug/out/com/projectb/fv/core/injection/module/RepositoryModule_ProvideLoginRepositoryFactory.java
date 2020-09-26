package com.projectb.fv.core.injection.module;

import com.projectb.fv.features.login.data.LoginRepository;
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
public final class RepositoryModule_ProvideLoginRepositoryFactory implements Factory<LoginRepository> {
  private final RepositoryModule module;

  private final Provider<LoginRepository.NetWork> dataProvider;

  public RepositoryModule_ProvideLoginRepositoryFactory(RepositoryModule module,
      Provider<LoginRepository.NetWork> dataProvider) {
    this.module = module;
    this.dataProvider = dataProvider;
  }

  @Override
  public LoginRepository get() {
    return provideLoginRepository(module, dataProvider.get());
  }

  public static RepositoryModule_ProvideLoginRepositoryFactory create(RepositoryModule module,
      Provider<LoginRepository.NetWork> dataProvider) {
    return new RepositoryModule_ProvideLoginRepositoryFactory(module, dataProvider);
  }

  public static LoginRepository provideLoginRepository(RepositoryModule instance,
      LoginRepository.NetWork data) {
    return Preconditions.checkNotNull(instance.provideLoginRepository(data), "Cannot return null from a non-@Nullable @Provides method");
  }
}
