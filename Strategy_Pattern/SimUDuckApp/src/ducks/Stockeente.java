package SimUDuckApp.src.ducks;

import SimUDuckApp.src.capabilities.fly.CanFly;
import SimUDuckApp.src.capabilities.quak.CanQuak;
import SimUDuckApp.src.capabilities.swim.CanSwim;

public class Stockeente extends Duck
{

    @Override
    public void display()
    {
        System.out.println("Stockeente display");
    }

    public Stockeente()
    {
        super(new CanSwim(), new CanFly(), new CanQuak());
    }
}
