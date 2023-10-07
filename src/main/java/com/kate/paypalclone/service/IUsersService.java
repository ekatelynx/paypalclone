package com.kate.paypalclone.service;

import com.kate.paypalclone.model.UsersModel;

import java.util.Optional;

public interface IUsersService {
    public UsersModel registerUser(UsersModel usersModel);

    public UsersModel authenticate(String email, String password);

    public boolean duplicateUserCheck (String email);
}
