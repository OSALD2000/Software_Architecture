package starbucksWWS.base;

import java.lang.reflect.Constructor;

public abstract class Beverage
{

    private String description;

    public abstract double getCost();

    public Beverage add(Class<? extends Decorator> extands)
    {
        try {
            Constructor<? extends Decorator> constructor = extands.getDeclaredConstructor();
            Decorator decorator = constructor.newInstance();
            decorator.setBeverage(this);

            return decorator;
        }
        catch (Exception e)
        {
            throw new RuntimeException(e);
        }
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public double calculateCost()
    {
        return getCost();
    };
}
