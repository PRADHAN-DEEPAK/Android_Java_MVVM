package com.projectb.fv.features.login.data;

import com.projectb.fv.features.login.model.UserModel;

import javax.inject.Inject;

/**
 * Created by Sibin E A on 07,September,2020 sibinea1@gmail.com
 **/
public interface UserStorageRepository {

    void insertUser(UserModel userModel);

    UserModel getUser();

    class Database implements UserStorageRepository {
        UserDao userDao;

        @Inject
        Database(UserDao userDao) {
            this.userDao = userDao;
        }

        public void insertUser(UserModel userModel) {
            userDao.insert(userModel);
        }

        @Override
        public UserModel getUser() {
            return userDao.getUser();
        }

    }
}
