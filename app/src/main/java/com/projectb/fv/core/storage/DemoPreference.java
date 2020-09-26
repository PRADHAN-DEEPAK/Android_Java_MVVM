package com.projectb.fv.core.storage;

import android.content.Context;
import android.content.SharedPreferences;

import javax.inject.Inject;

/**
 * Created by Sibin E A on 07,September,2020 sibinea1@gmail.com
 **/
public interface DemoPreference {
    static final String PREFERENCE_NAME = "demo_shared_preferences";

    void putData(String key, String data);

    void putData(String key, int data);

    void putData(String key, Boolean data);

    String getData(String key);

    int getIntData(String key);

    Boolean getBooleanData(String key);

    class Preference implements DemoPreference {
        Context context;
        SharedPreferences preferences;

        @Inject
        Preference(Context context) {
            this.context = context;
            preferences = this.context.getSharedPreferences(PREFERENCE_NAME, Context.MODE_PRIVATE);
        }

        @Override
        public void putData(String key, String data) {
            preferences.edit().putString(key, data).apply();
        }

        @Override
        public void putData(String key, int data) {
            preferences.edit().putInt(key, data).apply();

        }

        @Override
        public void putData(String key, Boolean data) {
            preferences.edit().putBoolean(key, data).apply();
        }

        @Override
        public String getData(String key) {
            return preferences.getString(key, "");
        }

        @Override
        public int getIntData(String key) {
            return preferences.getInt(key, 0);
        }

        @Override
        public Boolean getBooleanData(String key) {
            return preferences.getBoolean(key, false);
        }
    }
}
