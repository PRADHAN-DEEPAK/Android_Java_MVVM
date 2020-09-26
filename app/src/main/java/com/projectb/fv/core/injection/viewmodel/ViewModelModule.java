package com.projectb.fv.core.injection.viewmodel;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.projectb.fv.features.login.ui.LoginViewModel;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import dagger.Binds;
import dagger.MapKey;
import dagger.Module;
import dagger.multibindings.IntoMap;

/**
 * Created by Sibin E A on 07,September,2020 sibinea1@gmail.com
 **/
@Module
abstract public class ViewModelModule {

    @Target(ElementType.METHOD)
    @Retention(RetentionPolicy.RUNTIME)
    @MapKey
    @interface ViewModelKey {
        Class<? extends ViewModel> value();
    }

    @Binds
    abstract ViewModelProvider.Factory bindAppViewModelFactory(ViewModelFactory factory);


    @Binds
    @IntoMap
    @ViewModelKey(LoginViewModel.class)
    abstract ViewModel bindsLoginViewModel(LoginViewModel viewModel);
//
//    @Provides
//    @IntoMap
//    @ViewModelKey(LoginViewModel.class)
//    ViewModel bindsLoginViewModel(LoginRepository loginRepository) {
//        return new LoginViewModel(loginRepository);
//    }
}
