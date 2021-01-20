package domain.notification;

import domain.model.Customer;

public interface Notificator {
    void notify(Customer customer, String message);
}
