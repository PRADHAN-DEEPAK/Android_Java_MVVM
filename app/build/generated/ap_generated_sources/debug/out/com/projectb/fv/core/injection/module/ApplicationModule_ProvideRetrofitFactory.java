package com.projectb.fv.core.injection.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import retrofit2.Retrofit;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ApplicationModule_ProvideRetrofitFactory implements Factory<Retrofit> {
  private final ApplicationModule module;

  public ApplicationModule_ProvideRetrofitFactory(ApplicationModule module) {
    this.module = module;
  }

  @Override
  public Retrofit get() {
    return provideRetrofit(module);
  }

  public static ApplicationModule_ProvideRetrofitFactory create(ApplicationModule module) {
    return new ApplicationModule_ProvideRetrofitFactory(module);
  }

  public static Retrofit provideRetrofit(ApplicationModule instance) {
    return Preconditions.checkNotNull(instance.provideRetrofit(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
