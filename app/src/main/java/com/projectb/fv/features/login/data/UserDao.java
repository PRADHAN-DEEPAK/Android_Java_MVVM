package com.projectb.fv.features.login.data;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.projectb.fv.features.login.model.UserModel;

/**
 * Created by Sibin E A on 07,September,2020 sibinea1@gmail.com
 **/
@Dao
public interface UserDao {
    static final String GET_USER = "SELECT * FROM USER_DETAILS";

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(UserModel user);

    @Query(GET_USER)
    UserModel getUser();
}
