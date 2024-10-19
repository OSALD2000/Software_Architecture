package SimUDuckApp.src.ducks;

import SimUDuckApp.src.capabilities.fly.CanFly;
import SimUDuckApp.src.capabilities.quak.CanQuak;
import SimUDuckApp.src.capabilities.swim.CanSwim;

public class SchnatterEnte extends Duck
{
    @Override
    public void display()
    {
        System.out.println("SchnatterEnte display");
    }


    public SchnatterEnte()
    {
        super(new CanSwim(), new CanFly(), new CanQuak());
    }
}
