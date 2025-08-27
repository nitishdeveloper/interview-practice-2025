package DesignPatternPractice.ObserverPattern.Notification;

public interface NotificationSubject {
    void addObserver(NotificationObserver observer);
    void removeObserver(NotificationObserver observer);
    void notifyObserver();
}
