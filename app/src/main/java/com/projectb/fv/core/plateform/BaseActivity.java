package com.projectb.fv.core.plateform;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.projectb.fv.FvApplication;
import com.projectb.fv.R;
import com.projectb.fv.core.injection.AppComponent;

/**
 * Created by Sibin E A on 08,September,2020 sibinea1@gmail.com
 **/
abstract public class BaseActivity extends AppCompatActivity {

    AppComponent appComponent;

    abstract public BaseFragment fragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("BaseActivity", "onCreate");
        appComponent = ((FvApplication) getApplicationContext()).getAppComponent();
        appComponent.inject(this);
        setContentView(R.layout.activity_layout);
        addFragment(savedInstanceState);
    }

    private void addFragment(Bundle savedInstanceState) {
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().add(R.id.fragmentContainer, fragment()).commit();
        }

    }

}
