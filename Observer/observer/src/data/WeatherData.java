package observer.src.data;

import observer.src.base.Data;

public class WeatherData implements Data
{
    private String status;

    public String getStatus()
    {
        return status;
    }

    public void setStatus(String status)
    {
        this.status = status;
    }
}
