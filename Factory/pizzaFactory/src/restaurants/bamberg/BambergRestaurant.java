package pizzaFactory.src.restaurants.bamberg;

import pizzaFactory.src.base.Pizza;
import pizzaFactory.src.base.Restaurant;

public class BambergRestaurant extends Restaurant
{

    public BambergRestaurant()
    {
        super(new LocalFactory());
    }

    @Override
    public Pizza orderPizza(String type)
    {
        Pizza pizza = factory.createPizza(type);

        pizza.bake();
        pizza.pack();

        return pizza;
    }
}
