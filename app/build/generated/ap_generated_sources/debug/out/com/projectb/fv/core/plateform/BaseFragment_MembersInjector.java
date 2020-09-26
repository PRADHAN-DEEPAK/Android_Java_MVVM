package com.projectb.fv.core.plateform;

import androidx.lifecycle.ViewModelProvider;
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
public final class BaseFragment_MembersInjector implements MembersInjector<BaseFragment> {
  private final Provider<ViewModelProvider.Factory> viewModelFactoryProvider;

  public BaseFragment_MembersInjector(
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<BaseFragment> create(
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    return new BaseFragment_MembersInjector(viewModelFactoryProvider);}

  @Override
  public void injectMembers(BaseFragment instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  @InjectedFieldSignature("com.projectb.fv.core.plateform.BaseFragment.viewModelFactory")
  public static void injectViewModelFactory(BaseFragment instance,
      ViewModelProvider.Factory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}
