package DesignPatternPractice.ObserverPattern.Notification;

public class EmailNotificationObserver implements NotificationObserver {

    @Override
    public void update(String message) {
        sendEmail(message);
    }

    private void sendEmail(String message) {
        System.out.println("Email :: Notification :: Observer :: Sending Email " + message);
    }
}
