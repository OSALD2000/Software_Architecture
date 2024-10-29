package pizzaFactoryV2.src.base.common.toppings;

import pizzaFactoryV2.src.base.Pizza;
import pizzaFactoryV2.src.base.PizzaDecorator;

public class CheeseDecorator extends PizzaDecorator
{
    public CheeseDecorator(Pizza pizza)
    {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return decoratedPizza.getDescription() + ", cheese";
    }

    @Override
    public double cost()
    {
        return decoratedPizza.cost() + 1.5;
    }
}
