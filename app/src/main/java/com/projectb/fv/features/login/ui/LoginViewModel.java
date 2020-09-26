package com.projectb.fv.features.login.ui;

import android.annotation.SuppressLint;
import android.os.AsyncTask;
import android.util.Log;

import com.projectb.fv.core.plateform.BaseViewModel;
import com.projectb.fv.features.login.data.LoginRepository;
import com.projectb.fv.features.login.data.UserStorageRepository;
import com.projectb.fv.features.login.model.LoginRequest;
import com.projectb.fv.features.login.model.UserModel;

import javax.inject.Inject;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.observers.DisposableSingleObserver;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by Sibin E A on 08,September,2020 sibinea1@gmail.com
 **/
public class LoginViewModel extends BaseViewModel {
    LoginRepository loginRepository;
    UserStorageRepository userStorageRepository;

    @Inject
    public LoginViewModel(LoginRepository loginRepository, UserStorageRepository userStorageRepository) {
        this.loginRepository = loginRepository;
        this.userStorageRepository = userStorageRepository;
    }

    @SuppressLint("CheckResult")
    public void doLogin() {
        LoginRequest request = new LoginRequest();
        request.setEmail("eve.holt@reqres.in");
        request.setPassword("cityslicka");
        Log.d("doLogin", "clicked");
        loginRepository.doLogin(request)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(new DisposableSingleObserver<UserModel>() {
                    @Override
                    public void onSuccess(UserModel responseEntity) {
                        Log.i("####  responseEntity", responseEntity.getToken());

                        AsyncTask.execute(() -> userStorageRepository.insertUser(responseEntity));


                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.i("####  Throwable", "####  Throwable");
                    }
                });
    }

    public void getUserFromDB() {
        AsyncTask.execute(() -> {
            UserModel model = userStorageRepository.getUser();
            Log.i("####  UserModel", model.getToken());
        });

    }
}
