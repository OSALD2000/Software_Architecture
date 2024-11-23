package observer.src.observers;

import observer.src.base.Data;
import observer.src.base.Observer;
import observer.src.data.WeatherData;

public class WeatherObserver implements Observer
{
    private String name;

    public WeatherObserver(String name)
    {
        this.name = name;
    }

    @Override
    public void update(Data data)
    {
        System.out.println(name + " " +((WeatherData) data).getStatus());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
