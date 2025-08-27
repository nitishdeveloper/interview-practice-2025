package DesignPatternPractice.ObserverPattern.weather;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject{
    private final List<Observer> observers = new ArrayList<>();
    private float temperature, humidity;
    public void setWeatherData(float temperature, float humidity){
        this.temperature = temperature;
        this.humidity = humidity;
        this.notifyObservers();
    }

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(observer -> {
            observer.update(temperature,humidity);
        });
    }
}
