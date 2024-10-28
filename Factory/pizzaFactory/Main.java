package pizzaFactory;

import pizzaFactory.src.base.Restaurant;
import pizzaFactory.src.restaurants.bamberg.BambergRestaurant;
import pizzaFactory.src.restaurants.hof.HofResturant;

public class Main
{
    public static void main(String[] args)
    {
        Restaurant hofRestaurant = new HofResturant();
        Restaurant bambergRestaurant = new BambergRestaurant();

        hofRestaurant.orderPizza("FDI");

        bambergRestaurant.orderPizza("FDI");
    }
}
