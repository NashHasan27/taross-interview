package com.taross.interview.notification.service;

public class PushNotificationService implements MessageService {

    @Override
    public void sendMessage(String message, String recipient) {
        // Push notification sending logic
        System.out.println("Notification sent to [" + recipient + "] with Message [" + message + "]");
    }
}
