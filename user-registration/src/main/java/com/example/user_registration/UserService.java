package com.example.user_registration;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    private UserRepository userRepository;
    private NotificationService notificationService;

    public void registerUser(User user) {
        userRepository = new InMemoryUserRepository();
        userRepository.save(user);
        notificationService = new EmailNotificationService();
        notificationService.send("Account has been created", user.getEmail());
    }
}
