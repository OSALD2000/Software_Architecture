package pizzaFactoryV2.src.base.common.pizzas;

import pizzaFactoryV2.src.base.Pizza;
import pizzaFactoryV2.src.base.common.data.COMMON_PIZZA_SORT;

public class PizzaDiavoloStandard extends Pizza
{
    @Override
    public String getType()
    {
        return COMMON_PIZZA_SORT.DIAVOLO_PIZZA.getSort();
    }

    @Override
    public String getDescription()
    {
        return COMMON_PIZZA_SORT.DIAVOLO_PIZZA.getDescription();
    }

    @Override
    public double cost()
    {
        return COMMON_PIZZA_SORT.DIAVOLO_PIZZA.getCost();
    }
}
