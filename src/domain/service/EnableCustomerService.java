package domain.service;

import domain.model.Customer;
import domain.notification.Notificator;

public class EnableCustomerService {

    private Notificator notificator;

    public EnableCustomerService(Notificator notificator) {
        this.notificator = notificator;
    }

    public void enableCustomerAccount(Customer customer, String message) {
        customer.setActive(true);
        notificator.notify(customer, message);
    }
}
