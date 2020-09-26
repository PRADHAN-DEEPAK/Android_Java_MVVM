package com.projectb.fv.core.injection.module;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ApplicationModule_ProvideApplicationContextFactory implements Factory<Context> {
  private final ApplicationModule module;

  public ApplicationModule_ProvideApplicationContextFactory(ApplicationModule module) {
    this.module = module;
  }

  @Override
  public Context get() {
    return provideApplicationContext(module);
  }

  public static ApplicationModule_ProvideApplicationContextFactory create(
      ApplicationModule module) {
    return new ApplicationModule_ProvideApplicationContextFactory(module);
  }

  public static Context provideApplicationContext(ApplicationModule instance) {
    return Preconditions.checkNotNull(instance.provideApplicationContext(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
