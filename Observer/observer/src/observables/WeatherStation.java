package observer.src.observables;

import observer.src.base.Observable;
import observer.src.data.WeatherData;

public class WeatherStation extends Observable
{
    public WeatherStation()
    {
        super(new WeatherData());
    }

    public void updateWeatherStatus(String status)
    {
        ((WeatherData) this.data).setStatus(status);
        this.doUpdate();
    }
}
