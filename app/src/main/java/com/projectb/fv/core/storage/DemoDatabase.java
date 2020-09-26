package com.projectb.fv.core.storage;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.projectb.fv.features.login.data.UserDao;
import com.projectb.fv.features.login.model.UserModel;

import static com.projectb.fv.core.storage.DemoDatabase.DATABASE_VERSION;

/**
 * Created by Sibin E A on 07,September,2020 sibinea1@gmail.com
 **/
@Database(
        entities = {UserModel.class}, version = DATABASE_VERSION, exportSchema = false
)
public abstract class DemoDatabase extends RoomDatabase {
    static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "demo_database";

    public abstract UserDao userDao();

}
