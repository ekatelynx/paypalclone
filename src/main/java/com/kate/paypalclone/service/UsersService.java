package com.kate.paypalclone.service;

import com.kate.paypalclone.model.UsersModel;
import com.kate.paypalclone.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsersService implements IUsersService{

    @Autowired
    UsersRepository usersRepository;

    public UsersModel registerUser(UsersModel usersModel) {
        if (usersModel.getName() == null || usersModel.getPassword() == null || usersModel.getEmail() == null) {
            return null;
        } else {
            return usersRepository.save(usersModel);
        }
    }

    public UsersModel authenticate(String email, String password) {
        return usersRepository.findByEmailAndPassword(email, password).orElse(null);
    }

    public boolean duplicateUserCheck (String email) {
        Optional<UsersModel> userInfo = usersRepository.findByEmail(email);
        if (userInfo.isEmpty()) {
            System.out.println("No duplicate user was found, proceeding with registration for user old: " + email);
            return false;
        }
        else {
            System.out.println("A duplicate user was found, cancelling registration.");
            System.out.println("The user supplied the following email: " + email);
            System.out.println("The database returned the following email: " + userInfo.get().getEmail());
            return true;
        }
    }

}
