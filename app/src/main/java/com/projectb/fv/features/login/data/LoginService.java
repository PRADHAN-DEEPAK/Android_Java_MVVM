package com.projectb.fv.features.login.data;

import com.projectb.fv.features.login.model.LoginRequest;
import com.projectb.fv.features.login.model.UserModel;

import javax.inject.Inject;
import javax.inject.Singleton;

import io.reactivex.Single;
import retrofit2.Retrofit;

/**
 * Created by Sibin E A on 07,September,2020 sibinea1@gmail.com
 **/
@Singleton
public class LoginService implements LoginApi {
    Retrofit retrofit;

    @Inject
    LoginService(Retrofit retrofit) {
        this.retrofit = retrofit;
    }

    LoginApi getRetrofit() {
        return retrofit.create(LoginApi.class);
    }


    @Override
    public Single<UserModel> doLogin(LoginRequest request) {
        return getRetrofit().doLogin(request);
    }

    @Override
    public Single<UserModel> doSignUp() {
        return getRetrofit().doSignUp();
    }
}
