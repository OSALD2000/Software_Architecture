package pizzaFactoryV2.src.base.common.pizzas;

import pizzaFactoryV2.src.base.Pizza;

public class PizzaSalamiStandard extends Pizza
{
    @Override
    public String getType()
    {
        return "Salami Pizza";
    }

    @Override
    public String getDescription()
    {
        return "Salami pizza";
    }

    @Override
    public double cost()
    {
        return 9.0;
    }
}
