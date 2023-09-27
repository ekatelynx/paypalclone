package com.kate.paypalclone.service;

import com.kate.paypalclone.model.UsersModel;
import com.kate.paypalclone.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersService {

    @Autowired
    private UsersRepository usersRepository;

    public UsersModel registerUser(UsersModel usersModel) {
        if (usersModel.getName() == null || usersModel.getPassword() == null || usersModel.getEmail() == null) {
            return null;
        } else {
            return usersRepository.save(usersModel);//make this work
        }
    }

    public UsersModel authenticate(String email, String password) {
        return usersRepository.findByEmailAndPassword(email, password).orElse(null);
    }

}
