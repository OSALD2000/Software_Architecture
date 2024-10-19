package SimUDuckApp.src.ducks;

import SimUDuckApp.src.capabilities.fly.CantFly;
import SimUDuckApp.src.capabilities.quak.CantQuak;
import SimUDuckApp.src.capabilities.swim.CantSwim;

public class DecoEnte extends Duck
{
    @Override
    public void display()
    {
        System.out.println("DecoEnte display");
    }

    public DecoEnte()
    {
        super(new CantSwim(), new CantFly(), new CantQuak());
    }
}
