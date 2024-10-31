package com.lhakpa.ecommerce.Services;

import com.lhakpa.ecommerce.Entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    User createUser(User user);

    List<User> getAllUsers();

    Optional<User> findByUsername(String username);

    Optional<User> findByEmail(String email);

    Optional<User> findById(Long id);

    User updateUser(User user);

    void deleteUser(Long id);
}
