package com.projectb.fv.core.injection;

import com.projectb.fv.FvApplication;
import com.projectb.fv.core.injection.module.ApplicationModule;
import com.projectb.fv.core.injection.module.RepositoryModule;
import com.projectb.fv.core.injection.module.StorageModule;
import com.projectb.fv.core.injection.viewmodel.ViewModelModule;
import com.projectb.fv.core.plateform.BaseActivity;
import com.projectb.fv.features.login.ui.LoginFragment;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {ApplicationModule.class, RepositoryModule.class, StorageModule.class, ViewModelModule.class})
public interface AppComponent {

    void inject(FvApplication application);

    void inject(BaseActivity baseActivity);

    void inject(LoginFragment loginFragment);

}
