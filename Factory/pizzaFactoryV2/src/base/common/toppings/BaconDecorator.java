package pizzaFactoryV2.src.base.common.toppings;

import pizzaFactoryV2.src.base.Pizza;
import pizzaFactoryV2.src.base.PizzaDecorator;

public class BaconDecorator extends PizzaDecorator
{
    public BaconDecorator(Pizza pizza)
    {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return decoratedPizza.getDescription() + ", bacon";
    }

    @Override
    public double cost()
    {
        return decoratedPizza.cost() + 2.0;
    }
}
