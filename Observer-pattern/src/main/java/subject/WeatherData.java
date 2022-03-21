package subject;

import observer.DisplayObserver;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements WeatherDataSubject {
    private List<DisplayObserver> displayObservers;

    private int temp;

    public WeatherData() {
        this.displayObservers = new ArrayList<>();
    }

    private void notifyObservers(int temp) {
        for (DisplayObserver displayObserver : displayObservers) {
            displayObserver.update(temp);
        }
    }

    public void setTemp(int temp) {
        this.temp = temp;
        notifyObservers(temp);
    }

    @Override
    public void registerObserver(DisplayObserver displayObserver) {
        displayObservers.add(displayObserver);
    }

    @Override
    public void removeObserver(DisplayObserver displayObserver) {
        displayObservers.remove(displayObserver);
    }
}
