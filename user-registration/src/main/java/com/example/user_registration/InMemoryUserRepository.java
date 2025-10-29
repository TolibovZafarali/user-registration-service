package com.example.user_registration;

import java.util.HashMap;
import java.util.Map;

public class InMemoryUserRepository implements UserRepository {
    private HashMap<String, User> hashMap;

    @Override
    public void save(User user) {
        hashMap = new HashMap<>();
        hashMap.put(User.getEmail())
    }
}
