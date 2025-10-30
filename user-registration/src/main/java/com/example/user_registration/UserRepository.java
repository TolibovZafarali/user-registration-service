package com.example.user_registration;

public interface UserRepository {
    void save(User user);
    User findByEmail(String email);
}
