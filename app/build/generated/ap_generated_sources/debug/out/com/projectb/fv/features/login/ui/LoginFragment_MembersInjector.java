package com.projectb.fv.features.login.ui;

import androidx.lifecycle.ViewModelProvider;
import com.projectb.fv.core.navigation.Navigation;
import com.projectb.fv.core.plateform.BaseFragment_MembersInjector;
import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
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
public final class LoginFragment_MembersInjector implements MembersInjector<LoginFragment> {
  private final Provider<ViewModelProvider.Factory> viewModelFactoryProvider;

  private final Provider<Navigation> navigationProvider;

  public LoginFragment_MembersInjector(Provider<ViewModelProvider.Factory> viewModelFactoryProvider,
      Provider<Navigation> navigationProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
    this.navigationProvider = navigationProvider;
  }

  public static MembersInjector<LoginFragment> create(
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider,
      Provider<Navigation> navigationProvider) {
    return new LoginFragment_MembersInjector(viewModelFactoryProvider, navigationProvider);}

  @Override
  public void injectMembers(LoginFragment instance) {
    BaseFragment_MembersInjector.injectViewModelFactory(instance, viewModelFactoryProvider.get());
    injectNavigation(instance, navigationProvider.get());
  }

  @InjectedFieldSignature("com.projectb.fv.features.login.ui.LoginFragment.navigation")
  public static void injectNavigation(LoginFragment instance, Navigation navigation) {
    instance.navigation = navigation;
  }
}
