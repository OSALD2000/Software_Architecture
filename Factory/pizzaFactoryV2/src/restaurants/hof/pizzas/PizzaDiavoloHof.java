package pizzaFactoryV2.src.restaurants.hof.pizzas;

import pizzaFactoryV2.src.base.common.pizzas.PizzaDiavoloStandard;

public class PizzaDiavoloHof extends PizzaDiavoloStandard
{
    @Override
    public String getType()
    {
        return "Diavolo Pizza Hof";
    }

    @Override
    public String getDescription()
    {
        return "Diavolo pizza Hof with special extras";
    }

    @Override
    public double cost()
    {
        return 10.5;
    }

}
