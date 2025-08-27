package DesignPatternPractice.ObserverPattern.weather;

public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        MobileApp mobileApp = new MobileApp();
        DesktopApp desktopApp = new DesktopApp();

        weatherStation.attach(mobileApp);
        weatherStation.attach(desktopApp);

        weatherStation.setWeatherData(30.0f, 65.0f);
        weatherStation.setWeatherData(32.0f, 70.0f);

        weatherStation.detach(mobileApp);
        weatherStation.detach(desktopApp);


    }
}
