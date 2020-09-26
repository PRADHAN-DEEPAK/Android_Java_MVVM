package com.projectb.fv.core.injection.module;

import com.projectb.fv.features.login.data.LoginRepository;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Sibin E A on 07,September,2020 sibinea1@gmail.com
 **/
@Module
public class RepositoryModule {

    @Provides
    @Singleton
    LoginRepository provideLoginRepository(LoginRepository.NetWork data) {
        return data;
    }
}
