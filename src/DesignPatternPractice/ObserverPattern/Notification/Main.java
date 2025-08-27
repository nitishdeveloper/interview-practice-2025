package DesignPatternPractice.ObserverPattern.Notification;

public class Main {
    public static void main(String[] args) {
        NotificationConcreteSubject notificationSubject = new NotificationConcreteSubject();

        EmailNotificationObserver emailNotificationObserver = new EmailNotificationObserver();
        SmsNotificationObserver smsNotificationObserver = new SmsNotificationObserver();

        notificationSubject.addObserver(emailNotificationObserver);
        notificationSubject.addObserver(smsNotificationObserver);

        notificationSubject.setEvent("Order #1234 has been placed successfully!");
        notificationSubject.removeObserver(emailNotificationObserver);

        notificationSubject.setEvent("Order #1234 has been shipped!");


    }
}
