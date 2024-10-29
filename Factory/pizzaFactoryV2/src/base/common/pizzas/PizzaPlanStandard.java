package pizzaFactoryV2.src.base.common.pizzas;

import pizzaFactoryV2.src.base.Pizza;

public class PizzaPlanStandard extends Pizza
{
    @Override
    public String getType()
    {
        return "Plan Pizza";
    }

    @Override
    public String getDescription()
    {
        return "Plan pizza";
    }

    @Override
    public double cost()
    {
        return 7.0;
    }
}