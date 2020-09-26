package com.projectb.fv.features.login.data;

import com.projectb.fv.features.login.model.LoginRequest;
import com.projectb.fv.features.login.model.UserModel;

import io.reactivex.Single;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by Sibin E A on 07,September,2020 sibinea1@gmail.com
 **/
public interface LoginApi {
    static String LOGIN = "api/login";
    static String SIGN_UP = "api/login";

    @POST(LOGIN)
    Single<UserModel> doLogin(@Body LoginRequest request);

    @POST(SIGN_UP)
    Single<UserModel> doSignUp();
}
