package com.carterbee.signup.user;

import java.util.List;
import java.util.Optional;

import com.carterbee.signup.registration.RegistrationRequest;

public interface IUserService {

    List<User> getUsers();
    User registerUser(RegistrationRequest request);
    Optional<User> findByEmail(String email);
    void saveUserVerificationToken(User theUser, String verificationToken);
    
}
