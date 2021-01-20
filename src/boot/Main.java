package boot;

import domain.model.Customer;
import domain.notification.Notificator;
import domain.notification.impl.NotificatorSMS;
import domain.service.EnableCustomerService;

public class Main {
    public static void main(String[] args) {
        // Generate two customers for mock
        var firstCustomer =
                new Customer("João Victor", "profissional.anastacio@gmail.com", "11111111111");

        var secondCustomer =
                new Customer("Peter Windrow", "peter.windrow@gmail.com", "11111111111");

        // Creating an instance of Notificator by NotificarSMS
        // Change for NotificatorEmail to send email
        Notificator notificator = new NotificatorSMS();

        // Creating an instance of EnableCustomerService and passing Notificator using dependency injection
        EnableCustomerService enableCustomerService = new EnableCustomerService(notificator);

        // Activating all customers and notifying by SMS
        enableCustomerService.enableCustomerAccount(firstCustomer, "Customer account enabled");
        enableCustomerService.enableCustomerAccount(secondCustomer, "Customer account enabled");
    }
}
