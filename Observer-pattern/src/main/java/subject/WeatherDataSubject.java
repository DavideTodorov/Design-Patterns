package subject;

import observer.DisplayObserver;

public interface WeatherDataSubject {

    void registerObserver(DisplayObserver displayObserver);

    void removeObserver(DisplayObserver displayObserver);
}
