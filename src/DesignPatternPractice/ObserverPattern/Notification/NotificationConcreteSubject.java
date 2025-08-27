package DesignPatternPractice.ObserverPattern.Notification;

import java.util.ArrayList;
import java.util.List;

public class NotificationConcreteSubject implements NotificationSubject {
    private final List<NotificationObserver> observers = new ArrayList<>();
    private String event;

    public void setEvent(String event) {
        this.event = event;
        this.notifyObserver();
    }

    @Override
    public void addObserver(NotificationObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(NotificationObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        observers.forEach(observer -> {
            observer.update(this.event);
        });
    }
}
