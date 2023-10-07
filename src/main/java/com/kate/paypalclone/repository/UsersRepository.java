package com.kate.paypalclone.repository;

import com.kate.paypalclone.model.UsersModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsersRepository extends JpaRepository<UsersModel, Long> {

    Optional<UsersModel> findByEmailAndPassword(String email, String password);
    Optional<UsersModel> findByEmail(String email);
}
