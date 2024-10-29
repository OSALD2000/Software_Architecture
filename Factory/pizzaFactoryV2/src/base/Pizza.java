package pizzaFactoryV2.src.base;

import starbucksWWS.base.Decorator;

import java.lang.reflect.Constructor;

public abstract class Pizza
{
    public abstract String getDescription();
    public abstract String getType();
    public abstract double cost();

    public void cut()
    {
        System.out.println("Cutting the " + getType());
    }

    public void pack()
    {
        System.out.println("Packing the "+ getType());
    }

    public void back()
    {
        System.out.println("Backing the "+ getType());
    }

    public Pizza addTopping(Class<? extends PizzaDecorator> topping)
    {
        try {
            Constructor<? extends PizzaDecorator> constructor = topping.getDeclaredConstructor(Pizza.class);
            return constructor.newInstance(this);
        }
        catch (Exception e)
        {
            throw new RuntimeException(e);
        }
    }
}
