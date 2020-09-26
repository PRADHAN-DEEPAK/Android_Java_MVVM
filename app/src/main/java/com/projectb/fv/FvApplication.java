package com.projectb.fv;

import android.app.Application;
import android.util.Log;

import com.projectb.fv.core.injection.AppComponent;
import com.projectb.fv.core.injection.DaggerAppComponent;
import com.projectb.fv.core.injection.module.ApplicationModule;

public class FvApplication extends Application {
    private AppComponent mAppComponent;

    @Override
    public void onCreate() {
        Log.e("FvApplication", "FvApplication");
        super.onCreate();
        mAppComponent = DaggerAppComponent.builder()
                .applicationModule(new ApplicationModule(
                        this
                ))
                .build();
    }

    public AppComponent getAppComponent() {
        return mAppComponent;
    }
}
