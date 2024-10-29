package pizzaFactoryV2.src.base.common.toppings;

import pizzaFactoryV2.src.base.Pizza;
import pizzaFactoryV2.src.base.PizzaDecorator;

public class OliveDecorator extends PizzaDecorator
{
    public OliveDecorator(Pizza pizza)
    {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return decoratedPizza.getDescription() + ", olive";
    }

    @Override
    public double cost()
    {
        return decoratedPizza.cost() + 0.8;
    }
}
