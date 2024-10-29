package pizzaFactoryV2.src.restaurants.dubai.pizzas;

import pizzaFactoryV2.src.base.common.pizzas.PizzaSalamiStandard;

public class PizzaSalamiDubai extends PizzaSalamiStandard
{
    @Override
    public String getType()
    {
        return "Salami Pizza Dubai";
    }

    @Override
    public String getDescription()
    {
        return "Salami pizza Hof with Halal Salami";
    }

    @Override
    public double cost()
    {
        return 7.0;
    }

}
