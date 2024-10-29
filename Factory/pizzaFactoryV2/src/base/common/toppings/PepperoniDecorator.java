package pizzaFactoryV2.src.base.common.toppings;

import pizzaFactoryV2.src.base.Pizza;
import pizzaFactoryV2.src.base.PizzaDecorator;

public class PepperoniDecorator extends PizzaDecorator
{
    public PepperoniDecorator(Pizza pizza)
    {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return decoratedPizza.getDescription() + ", pepperoni";
    }

    @Override
    public double cost()
    {
        return decoratedPizza.cost() + 2.0;
    }
}
