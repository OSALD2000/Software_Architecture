package pizzaFactory.src.restaurants.bamberg;

import pizzaFactory.src.base.Pizza;
import pizzaFactory.src.base.SimpleFactory;
import pizzaFactory.src.restaurants.bamberg.pizzas.Diavolo_Bamberg;
import pizzaFactory.src.restaurants.bamberg.pizzas.FDI_Bamberg;
import pizzaFactory.src.restaurants.bamberg.pizzas.Salami_Bamberg;

public class LocalFactory implements SimpleFactory
{
    @Override
    public Pizza createPizza(String type) {
        return switch (type) {
            case "Diavolo" -> new Diavolo_Bamberg();
            case "FDI" -> new FDI_Bamberg();
            case "Salami" -> new Salami_Bamberg();
            default -> null;
        };
    }
}
