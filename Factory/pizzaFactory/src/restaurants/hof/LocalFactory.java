package pizzaFactory.src.restaurants.hof;

import pizzaFactory.src.base.Pizza;
import pizzaFactory.src.base.SimpleFactory;
import pizzaFactory.src.restaurants.hof.pizzas.Diavolo_Hof;
import pizzaFactory.src.restaurants.hof.pizzas.FDI_Hof;
import pizzaFactory.src.restaurants.hof.pizzas.Salami_Hof;

public class LocalFactory implements SimpleFactory
{
    @Override
    public Pizza createPizza(String type)
    {
        return switch (type) {
            case "Diavolo" -> new Diavolo_Hof();
            case "FDI" -> new FDI_Hof();
            case "Salami" -> new Salami_Hof();
            default -> null;
        };
    }
}
