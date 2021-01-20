package domain.notification.impl;

import domain.model.Customer;
import domain.notification.Notificator;

public class NotificatorSMS implements Notificator {

    @Override
    public void notify(Customer customer, String message) {
        System.out.printf("SMS notification sent by %s with message: %s\n", customer.getName(), message);
    }
}
