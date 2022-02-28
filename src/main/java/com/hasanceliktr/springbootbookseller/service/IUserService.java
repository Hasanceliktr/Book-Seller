package com.hasanceliktr.springbootbookseller.service;

import java.util.Optional;

import com.hasanceliktr.springbootbookseller.model.User;

public interface IUserService {

	User saveUser(User user);

    Optional<User> findByUsername(String username);

    void makeAdmin(String username);

	

}
