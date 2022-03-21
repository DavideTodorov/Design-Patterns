package observer;

import subject.WeatherData;

public class PhoneTempDisplay implements DisplayApplication {
    private int temp;
    private WeatherData weatherData;

    public PhoneTempDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Phone: " + temp + " degrees.");
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
