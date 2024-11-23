package observer.src.observers;

import observer.src.base.Data;
import observer.src.base.Observer;
import observer.src.data.WeatherData;

public class WeatherAppGUI implements Observer
{
    @Override
    public void update(Data data)
    {
        System.out.println("GUI " + ((WeatherData) data).getStatus());
    }

}
