package com.projectb.fv.core.plateform;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.projectb.fv.FvApplication;
import com.projectb.fv.R;
import com.projectb.fv.core.common.Params;
import com.projectb.fv.core.injection.AppComponent;

import java.util.ArrayList;
import java.util.Objects;

import javax.inject.Inject;

/**
 * Created by Sibin E A on 08,September,2020 sibinea1@gmail.com
 **/
public abstract class BaseFragment extends Fragment {

    private static final String PARAM_LIST_KEY = "param_key";

    protected abstract int layoutId();


    public AppComponent getAppComponent() {
        return ((FvApplication) getActivity().getApplication()).getAppComponent();
    }

    @Inject
    public ViewModelProvider.Factory viewModelFactory;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.e("BaseFragment", "onCreateView");
        return inflater.inflate(layoutId(), container, false);
    }

    void replaceFragment(BaseFragment fragment, Boolean hasBackStack) {
        if (hasBackStack) {
            Objects.requireNonNull(getActivity()).getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragmentContainer, fragment).addToBackStack(null).commit();
        } else {
            Objects.requireNonNull(getActivity()).getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragmentContainer, fragment).commit();
        }
    }


    void replaceFragmentWithParams(BaseFragment fragment, ArrayList<Params> params, Boolean hasBackStack) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(PARAM_LIST_KEY, params);
        fragment.setArguments(bundle);
        replaceFragment(fragment, hasBackStack);
    }
}
