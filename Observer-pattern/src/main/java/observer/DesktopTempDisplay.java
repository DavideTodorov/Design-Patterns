package observer;

import subject.WeatherData;

public class DesktopTempDisplay implements DisplayApplication {

    private int temp;
    private WeatherData weatherData;

    public DesktopTempDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Desktop: " + temp + " degrees.");
    }

    @Override
    public void update(int temp) {
        this.temp = temp;
        display();
    }

    @Override
    public void removeFromSubject() {
        weatherData.removeObserver(this);
    }
}
