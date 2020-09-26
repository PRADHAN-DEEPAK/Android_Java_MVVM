package com.projectb.fv.core.injection.module;

import android.content.Context;

import androidx.room.Room;

import com.projectb.fv.core.storage.DemoDatabase;
import com.projectb.fv.core.storage.DemoPreference;
import com.projectb.fv.features.login.data.UserDao;
import com.projectb.fv.features.login.data.UserStorageRepository;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Sibin E A on 07,September,2020 sibinea1@gmail.com
 **/
@Module
public class StorageModule {

    @Provides
    @Singleton
    DemoPreference provideSharedPreferences(DemoPreference.Preference data) {
        return data;
    }

    @Provides
    @Singleton
    DemoDatabase provideDemoDatabase(Context context) {
        return Room.databaseBuilder(context, DemoDatabase.class, DemoDatabase.DATABASE_NAME)
                .fallbackToDestructiveMigration().build();
    }

    @Singleton
    @Provides
    UserDao provideUserDao(DemoDatabase database) {
        return database.userDao();
    }

    @Provides
    @Singleton
    UserStorageRepository provideUserStorageRepository(UserStorageRepository.Database source) {
        return source;
    }

}


