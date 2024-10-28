package pizzaFactory;

import pizzaFactory.src.base.Pizza;
import pizzaFactory.src.base.Restaurant;
import pizzaFactory.src.restaurants.bamberg.BambergRestaurant;
import pizzaFactory.src.restaurants.hof.HofResturant;

public class Main
{
    public static void main(String[] args)
    {
        Restaurant hofRestaurant = new HofResturant();
        Restaurant bambergRestaurant = new BambergRestaurant();

        Pizza p1 = hofRestaurant.orderPizza("FDI");

        Pizza p2 = bambergRestaurant.orderPizza("FDI");

        System.out.println(p1.getType());
        System.out.println(p2.getType());
    }
}
