package DesignPatternPractice.ObserverPattern.weather;

public class DesktopApp implements Observer {
    private float temperature, humidity;

    @Override
    public void update(float temperature, float humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.display();
    }

    public void display() {
        System.out.println("DesktopApp :: Weather Display - Temperature: " + temperature + "°C, Humidity: " + humidity + "%, Pressure: ");
    }
}