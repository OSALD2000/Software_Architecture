package pizzaFactoryV2.src.restaurants.dubai.pizzas;

import pizzaFactoryV2.src.base.common.pizzas.PizzaSalamiStandard;
import pizzaFactoryV2.src.restaurants.dubai.data.DUBAI_PIZZA_SORT;

public class PizzaSalamiDubai extends PizzaSalamiStandard
{
    @Override
    public String getType()
    {
        return DUBAI_PIZZA_SORT.SALAMI_PIZZA_DUBAI.getSort();
    }

    @Override
    public String getDescription()
    {
        return DUBAI_PIZZA_SORT.SALAMI_PIZZA_DUBAI.getDescription();
    }

    @Override
    public double cost()
    {
        return DUBAI_PIZZA_SORT.SALAMI_PIZZA_DUBAI.getCost();
    }

}
