package pizzaFactoryV2;

import pizzaFactoryV2.src.base.Pizza;
import pizzaFactoryV2.src.base.common.toppings.CheeseDecorator;
import pizzaFactoryV2.src.base.common.toppings.OliveDecorator;
import pizzaFactoryV2.src.base.common.toppings.PepperoniDecorator;
import pizzaFactoryV2.src.restaurants.dubai.DubaiPizzaFactory;
import pizzaFactoryV2.src.restaurants.hof.HofRestaurant;
import pizzaFactoryV2.src.base.Restaurant;
import pizzaFactoryV2.src.restaurants.hof.HofPizzaFactory;

public class Main
{
    public static void main(String[] args)
    {
        Restaurant restaurantHof = new HofRestaurant(new HofPizzaFactory());

        Restaurant restaurantDubai = new HofRestaurant(new DubaiPizzaFactory());

        Pizza p1 = restaurantHof.orderPizza("salami");

        Pizza p2 = restaurantDubai.orderPizza("salami");

        p1 = p1.addTopping(CheeseDecorator.class).addTopping(OliveDecorator.class).addTopping(PepperoniDecorator.class);

        p2 = p2.addTopping(CheeseDecorator.class);

        System.out.println(p1.getDescription()+ " cost : " + p1.cost() + " $");

        System.out.println(p2.getDescription()+ " cost : " + p2.cost() + " $");

    }
}
