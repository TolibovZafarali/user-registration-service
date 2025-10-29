package com.example.user_registration;

import org.springframework.beans.factory.annotation.Value;

public class EmailNotificationService implements NotificationService {

    @Value("${mail-server.host}")
    private String host;

    @Value("${mail-server.port}")
    private int port;

    @Override
    public void send(String message, String recipientEmail) {
        System.out.println("Sending message: " + message);
        System.out.println("To recipient: " + recipientEmail);
        System.out.println("Host: " + host);
        System.out.println("Port: " + port);
    }
}
