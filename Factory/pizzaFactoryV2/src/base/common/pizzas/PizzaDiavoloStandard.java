package pizzaFactoryV2.src.base.common.pizzas;

import pizzaFactoryV2.src.base.Pizza;

public class PizzaDiavoloStandard extends Pizza
{
    @Override
    public String getType()
    {
        return "Diavolo Pizza";
    }

    @Override
    public String getDescription()
    {
        return "Diavolo pizza";
    }

    @Override
    public double cost()
    {
        return 10.0;
    }
}
