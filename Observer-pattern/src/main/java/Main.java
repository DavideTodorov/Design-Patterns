import observer.DesktopTempDisplay;
import observer.DisplayApplication;
import observer.PhoneTempDisplay;
import subject.WeatherData;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        ArrayList<DisplayApplication> displayApplications = new ArrayList<>();
        DisplayApplication phoneTempDisplay = new PhoneTempDisplay(weatherData);
        DisplayApplication desktopTempDisplay = new DesktopTempDisplay(weatherData);
        displayApplications.add(phoneTempDisplay);
        displayApplications.add(desktopTempDisplay);
        
        weatherData.setTemp(10);

        desktopTempDisplay.removeFromSubject();

        weatherData.setTemp(20);

        System.out.println("-------");
        for (DisplayApplication displayApplication : displayApplications) {
            displayApplication.display();
        }
    }
}
