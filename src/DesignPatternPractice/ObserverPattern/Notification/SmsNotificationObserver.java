package DesignPatternPractice.ObserverPattern.Notification;

public class SmsNotificationObserver implements NotificationObserver {
    @Override
    public void update(String message) {
        sendEmail(message);
    }

    private void sendEmail(String message) {
        System.out.println("SMS :: Notification :: Observer :: Sending SMS " + message);
    }
}
