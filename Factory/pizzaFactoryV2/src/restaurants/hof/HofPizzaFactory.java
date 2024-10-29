package pizzaFactoryV2.src.restaurants.hof;

import pizzaFactoryV2.src.base.Pizza;
import pizzaFactoryV2.src.base.factories.PizzaFactory;
import pizzaFactoryV2.src.restaurants.hof.pizzas.PizzaDiavoloHof;

public class HofPizzaFactory extends PizzaFactory
{
    @Override
    public Pizza createPizza(String type)
    {
        return switch (type) {
            case "diavolo" -> new PizzaDiavoloHof();
            default -> super.createPizza(type);
        };
    }
}
