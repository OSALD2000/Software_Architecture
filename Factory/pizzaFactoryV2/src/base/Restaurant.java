package pizzaFactoryV2.src.base;

import pizzaFactoryV2.src.base.factories.PizzaFactory;

public abstract class Restaurant
{
    protected PizzaFactory pizzaFactory;

    public Restaurant(PizzaFactory pizzaFactory)
    {
        this.pizzaFactory = pizzaFactory;
    }

    public Pizza orderPizza(String type)
    {
        Pizza pizza = pizzaFactory.createPizza(type);

        pizza.back();
        pizza.cut();
        pizza.pack();

        return pizza;
    }
}
