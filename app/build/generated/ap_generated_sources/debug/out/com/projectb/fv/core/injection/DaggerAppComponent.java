package com.projectb.fv.core.injection;

import android.content.Context;
import androidx.lifecycle.ViewModel;
import com.projectb.fv.FvApplication;
import com.projectb.fv.core.injection.module.ApplicationModule;
import com.projectb.fv.core.injection.module.ApplicationModule_ProvideApplicationContextFactory;
import com.projectb.fv.core.injection.module.ApplicationModule_ProvideRetrofitFactory;
import com.projectb.fv.core.injection.module.RepositoryModule;
import com.projectb.fv.core.injection.module.RepositoryModule_ProvideLoginRepositoryFactory;
import com.projectb.fv.core.injection.module.StorageModule;
import com.projectb.fv.core.injection.module.StorageModule_ProvideDemoDatabaseFactory;
import com.projectb.fv.core.injection.module.StorageModule_ProvideUserDaoFactory;
import com.projectb.fv.core.injection.module.StorageModule_ProvideUserStorageRepositoryFactory;
import com.projectb.fv.core.injection.viewmodel.ViewModelFactory;
import com.projectb.fv.core.injection.viewmodel.ViewModelFactory_Factory;
import com.projectb.fv.core.navigation.Navigation;
import com.projectb.fv.core.navigation.Navigation_Factory;
import com.projectb.fv.core.network.NetworkHandler;
import com.projectb.fv.core.network.NetworkHandler_Factory;
import com.projectb.fv.core.plateform.BaseActivity;
import com.projectb.fv.core.plateform.BaseFragment_MembersInjector;
import com.projectb.fv.core.storage.DemoDatabase;
import com.projectb.fv.features.login.data.LoginRepository;
import com.projectb.fv.features.login.data.LoginRepository_NetWork_Factory;
import com.projectb.fv.features.login.data.LoginService;
import com.projectb.fv.features.login.data.LoginService_Factory;
import com.projectb.fv.features.login.data.UserDao;
import com.projectb.fv.features.login.data.UserStorageRepository;
import com.projectb.fv.features.login.data.UserStorageRepository_Database_Factory;
import com.projectb.fv.features.login.ui.LoginFragment;
import com.projectb.fv.features.login.ui.LoginFragment_MembersInjector;
import com.projectb.fv.features.login.ui.LoginViewModel;
import com.projectb.fv.features.login.ui.LoginViewModel_Factory;
import dagger.internal.DoubleCheck;
import dagger.internal.MapProviderFactory;
import dagger.internal.Preconditions;
import java.util.Map;
import javax.annotation.Generated;
import javax.inject.Provider;
import retrofit2.Retrofit;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerAppComponent implements AppComponent {
  private Provider<Context> provideApplicationContextProvider;

  private Provider<NetworkHandler> networkHandlerProvider;

  private Provider<Retrofit> provideRetrofitProvider;

  private Provider<LoginService> loginServiceProvider;

  private Provider<LoginRepository.NetWork> netWorkProvider;

  private Provider<LoginRepository> provideLoginRepositoryProvider;

  private Provider<DemoDatabase> provideDemoDatabaseProvider;

  private Provider<UserDao> provideUserDaoProvider;

  private Provider<UserStorageRepository.Database> databaseProvider;

  private Provider<UserStorageRepository> provideUserStorageRepositoryProvider;

  private Provider<LoginViewModel> loginViewModelProvider;

  private Provider<Map<Class<? extends ViewModel>, Provider<ViewModel>>> mapOfClassOfAndProviderOfViewModelProvider;

  private Provider<ViewModelFactory> viewModelFactoryProvider;

  private Provider<Navigation> navigationProvider;

  private DaggerAppComponent(ApplicationModule applicationModuleParam,
      RepositoryModule repositoryModuleParam, StorageModule storageModuleParam) {

    initialize(applicationModuleParam, repositoryModuleParam, storageModuleParam);
  }

  public static Builder builder() {
    return new Builder();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final ApplicationModule applicationModuleParam,
      final RepositoryModule repositoryModuleParam, final StorageModule storageModuleParam) {
    this.provideApplicationContextProvider = DoubleCheck.provider(ApplicationModule_ProvideApplicationContextFactory.create(applicationModuleParam));
    this.networkHandlerProvider = DoubleCheck.provider(NetworkHandler_Factory.create(provideApplicationContextProvider));
    this.provideRetrofitProvider = DoubleCheck.provider(ApplicationModule_ProvideRetrofitFactory.create(applicationModuleParam));
    this.loginServiceProvider = DoubleCheck.provider(LoginService_Factory.create(provideRetrofitProvider));
    this.netWorkProvider = LoginRepository_NetWork_Factory.create(networkHandlerProvider, loginServiceProvider);
    this.provideLoginRepositoryProvider = DoubleCheck.provider(RepositoryModule_ProvideLoginRepositoryFactory.create(repositoryModuleParam, netWorkProvider));
    this.provideDemoDatabaseProvider = DoubleCheck.provider(StorageModule_ProvideDemoDatabaseFactory.create(storageModuleParam, provideApplicationContextProvider));
    this.provideUserDaoProvider = DoubleCheck.provider(StorageModule_ProvideUserDaoFactory.create(storageModuleParam, provideDemoDatabaseProvider));
    this.databaseProvider = UserStorageRepository_Database_Factory.create(provideUserDaoProvider);
    this.provideUserStorageRepositoryProvider = DoubleCheck.provider(StorageModule_ProvideUserStorageRepositoryFactory.create(storageModuleParam, databaseProvider));
    this.loginViewModelProvider = LoginViewModel_Factory.create(provideLoginRepositoryProvider, provideUserStorageRepositoryProvider);
    this.mapOfClassOfAndProviderOfViewModelProvider = MapProviderFactory.<Class<? extends ViewModel>, ViewModel>builder(1).put(LoginViewModel.class, (Provider) loginViewModelProvider).build();
    this.viewModelFactoryProvider = DoubleCheck.provider(ViewModelFactory_Factory.create(mapOfClassOfAndProviderOfViewModelProvider));
    this.navigationProvider = DoubleCheck.provider(Navigation_Factory.create());
  }

  @Override
  public void inject(FvApplication application) {
  }

  @Override
  public void inject(BaseActivity baseActivity) {
  }

  @Override
  public void inject(LoginFragment loginFragment) {
    injectLoginFragment(loginFragment);}

  private LoginFragment injectLoginFragment(LoginFragment instance) {
    BaseFragment_MembersInjector.injectViewModelFactory(instance, viewModelFactoryProvider.get());
    LoginFragment_MembersInjector.injectNavigation(instance, navigationProvider.get());
    return instance;
  }

  public static final class Builder {
    private ApplicationModule applicationModule;

    private RepositoryModule repositoryModule;

    private StorageModule storageModule;

    private Builder() {
    }

    public Builder applicationModule(ApplicationModule applicationModule) {
      this.applicationModule = Preconditions.checkNotNull(applicationModule);
      return this;
    }

    public Builder repositoryModule(RepositoryModule repositoryModule) {
      this.repositoryModule = Preconditions.checkNotNull(repositoryModule);
      return this;
    }

    public Builder storageModule(StorageModule storageModule) {
      this.storageModule = Preconditions.checkNotNull(storageModule);
      return this;
    }

    public AppComponent build() {
      Preconditions.checkBuilderRequirement(applicationModule, ApplicationModule.class);
      if (repositoryModule == null) {
        this.repositoryModule = new RepositoryModule();
      }
      if (storageModule == null) {
        this.storageModule = new StorageModule();
      }
      return new DaggerAppComponent(applicationModule, repositoryModule, storageModule);
    }
  }
}
