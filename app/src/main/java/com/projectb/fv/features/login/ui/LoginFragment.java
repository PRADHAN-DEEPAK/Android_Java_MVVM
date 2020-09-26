package com.projectb.fv.features.login.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.ViewModelProviders;

import com.projectb.fv.R;
import com.projectb.fv.core.navigation.Navigation;
import com.projectb.fv.core.plateform.BaseFragment;
import com.projectb.fv.databinding.FragmentLoginBinding;

import javax.inject.Inject;

/**
 * Created by Sibin E A on 08,September,2020 sibinea1@gmail.com
 **/
public class LoginFragment extends BaseFragment {

    public static LoginFragment newInstance() {
        LoginFragment loginFragment = new LoginFragment();
        Bundle bundle = new Bundle();
        loginFragment.setArguments(bundle);
        return loginFragment;
    }

    @Inject
    Navigation navigation;

    @Override
    protected int layoutId() {
        return R.layout.fragment_login;
    }

    private LoginViewModel loginViewModel;
    private FragmentLoginBinding binding;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        binding = FragmentLoginBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getAppComponent().inject(this);
        loginViewModel = ViewModelProviders.of(this, viewModelFactory).get(LoginViewModel.class);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.button.setOnClickListener(button -> {
            loginViewModel.doLogin();
        });
        binding.dbButton.setOnClickListener(dbButton -> {
            loginViewModel.getUserFromDB();
            navigation.showLogin(getContext());
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
