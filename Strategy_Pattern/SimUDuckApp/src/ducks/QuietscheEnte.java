package SimUDuckApp.src.ducks;

import SimUDuckApp.src.capabilities.fly.CantFly;
import SimUDuckApp.src.capabilities.quak.CantQuak;
import SimUDuckApp.src.capabilities.swim.CanSwim;

public class QuietscheEnte extends Duck
{
    @Override
    public void display()
    {
        System.out.println("QuietscheEnte display");
    }

    public QuietscheEnte()
    {
        super(new CanSwim(), new CantFly(), new CantQuak());
    }
}
