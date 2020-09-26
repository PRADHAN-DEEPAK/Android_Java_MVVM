package com.projectb.fv.features.login.ui;

import com.projectb.fv.core.plateform.BaseActivity;
import com.projectb.fv.core.plateform.BaseFragment;

/**
 * Created by Sibin E A on 08,September,2020 sibinea1@gmail.com
 **/

public class LoginActivity extends BaseActivity {

    @Override
    public BaseFragment fragment() {
        return LoginFragment.newInstance();
    }

}
