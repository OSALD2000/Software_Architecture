package pizzaFactoryV2.src.base.factories;

import pizzaFactoryV2.src.base.Pizza;
import pizzaFactoryV2.src.base.common.pizzas.PizzaDiavoloStandard;
import pizzaFactoryV2.src.base.common.pizzas.PizzaPlanStandard;
import pizzaFactoryV2.src.base.common.pizzas.PizzaSalamiStandard;

public class PizzaFactory
{
    public Pizza createPizza(String type)
    {
        return switch (type) {
            case "plan" -> new PizzaPlanStandard();
            case "diavolo" -> new PizzaDiavoloStandard();
            case "salami" -> new PizzaSalamiStandard();
            default -> throw new IllegalArgumentException("Pizza type not recognised");
        };
    }
}
