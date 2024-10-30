package pizzaFactoryV2.src.restaurants.hof.pizzas;

import pizzaFactoryV2.src.base.common.pizzas.PizzaDiavoloStandard;
import pizzaFactoryV2.src.restaurants.hof.data.HOF_PIZZA_SORT;


public class PizzaDiavoloHof extends PizzaDiavoloStandard
{
    @Override
    public String getType()
    {
        return HOF_PIZZA_SORT.DIAVOLO_PIZZA_HOF.getSort();
    }

    @Override
    public String getDescription()
    {
        return  HOF_PIZZA_SORT.DIAVOLO_PIZZA_HOF.getDescription();
    }

    @Override
    public double cost()
    {
        return HOF_PIZZA_SORT.DIAVOLO_PIZZA_HOF.getCost();
    }

}
