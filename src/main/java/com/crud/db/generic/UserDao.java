package com.crud.db.generic;

import com.crud.api.User;
import org.jdbi.v3.core.Jdbi;

public class UserDao extends BaseGeneric<User> {

    public UserDao(Jdbi jdbi) {
        super(jdbi, User.class, "user");
    }
}
