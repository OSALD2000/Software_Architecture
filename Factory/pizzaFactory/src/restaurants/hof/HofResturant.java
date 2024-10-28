package pizzaFactory.src.restaurants.hof;

import pizzaFactory.src.base.Restaurant;

public class HofResturant extends Restaurant
{
    public HofResturant()
    {
        super(new LocalFactory());
    }
}
