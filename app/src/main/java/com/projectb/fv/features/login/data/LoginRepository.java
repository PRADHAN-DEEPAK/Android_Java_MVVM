package com.projectb.fv.features.login.data;

import com.projectb.fv.core.network.NetworkHandler;
import com.projectb.fv.features.login.model.LoginRequest;
import com.projectb.fv.features.login.model.UserModel;

import javax.inject.Inject;

import io.reactivex.Single;

/**
 * Created by Sibin E A on 07,September,2020 sibinea1@gmail.com
 **/

public interface LoginRepository {

    Single<UserModel> doLogin(LoginRequest request);

    Single<UserModel> doSignUp();

    class NetWork implements LoginRepository {
        NetworkHandler networkHandler;
        LoginService loginService;

        @Inject
        NetWork(NetworkHandler networkHandler, LoginService loginService) {
            this.networkHandler = networkHandler;
            this.loginService = loginService;
        }

        @Override
        public Single<UserModel> doLogin(LoginRequest request) {
            if (networkHandler.isConnected()) {
                return loginService.doLogin(request);
            }
            return null;
        }

        @Override
        public Single<UserModel> doSignUp() {
            if (networkHandler.isConnected()) {
                return loginService.doSignUp();
            }
            return null;
        }
    }
}
