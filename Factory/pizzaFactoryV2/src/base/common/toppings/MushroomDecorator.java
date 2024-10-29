package pizzaFactoryV2.src.base.common.toppings;

import pizzaFactoryV2.src.base.Pizza;
import pizzaFactoryV2.src.base.PizzaDecorator;

public class MushroomDecorator extends PizzaDecorator
{
    public MushroomDecorator(Pizza pizza)
    {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return decoratedPizza.getDescription() + ", mushroom";
    }

    @Override
    public double cost()
    {
        return decoratedPizza.cost() + 1.0;
    }
}
