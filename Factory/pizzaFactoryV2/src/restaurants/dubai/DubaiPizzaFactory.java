package pizzaFactoryV2.src.restaurants.dubai;

import pizzaFactoryV2.src.base.Pizza;
import pizzaFactoryV2.src.base.factories.PizzaFactory;
import pizzaFactoryV2.src.restaurants.dubai.pizzas.PizzaSalamiDubai;

public class DubaiPizzaFactory extends PizzaFactory
{
    @Override
    public Pizza createPizza(String type)
    {
        return switch (type) {
            case "salami" -> new PizzaSalamiDubai();
            default -> super.createPizza(type);
        };
    }
}
