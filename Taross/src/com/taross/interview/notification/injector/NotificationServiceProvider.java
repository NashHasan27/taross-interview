package com.taross.interview.notification.injector;

import com.taross.interview.notification.consumer.ServiceProcessor;
import com.taross.interview.notification.consumer.NotificationProcessor;
import com.taross.interview.notification.service.MessageService;
import com.taross.interview.notification.service.PushNotificationService;

public class NotificationServiceProvider implements MessageServiceProvider {

    @Override
    public ServiceProcessor getProcessor() {
        // Provide a PushNotificationService instance or similar service
        MessageService pushService = new PushNotificationService();
        return new NotificationProcessor(pushService);
    }
}
