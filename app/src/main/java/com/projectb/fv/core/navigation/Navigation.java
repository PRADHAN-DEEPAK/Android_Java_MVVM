package com.projectb.fv.core.navigation;

import android.content.Context;
import android.content.Intent;

import com.projectb.fv.features.login.ui.LoginActivity;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by Sibin E A on 10,September,2020 sibinea1@gmail.com
 **/
@Singleton
public class Navigation {
    @Inject
    Navigation() {
    }

    public void showLogin(Context context) {
        context.startActivity(new Intent(context, LoginActivity.class));
    }
}

