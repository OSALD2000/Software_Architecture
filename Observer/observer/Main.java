package observer;

import observer.src.observables.WeatherStation;
import observer.src.observers.WeatherAppGUI;
import observer.src.observers.WeatherObserver;

public class Main
{
    public static void main(String[] args) throws InterruptedException {
        WeatherStation station = new WeatherStation();

        station.addObserver(new WeatherObserver( "Weather Observer"));
        station.addObserver(new WeatherAppGUI());

        station.updateWeatherStatus("The sky is clear and sunny, with a light breeze.");

        Thread.sleep(2000);
        station.updateWeatherStatus("Temperatures are dropping, and snowflakes are gently falling.");

        Thread.sleep(2000);
        station.updateWeatherStatus("The evening is calm, with clear skies and cool temperatures.");

        Thread.sleep(2000);
        station.updateWeatherStatus("Gusty winds are sweeping through the area, with dust in the air.");

        Thread.sleep(2000);
        station.updateWeatherStatus("Light rain showers are falling intermittently throughout the day.");

        Thread.sleep(2000);
        station.updateWeatherStatus("Humidity levels are high, and the air feels heavy with moisture.");
    }
}
