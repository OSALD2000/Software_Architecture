package SimUDuckApp.src.ducks;

import SimUDuckApp.src.capabilities.fly.CanFly;
import SimUDuckApp.src.capabilities.quak.CantQuak;
import SimUDuckApp.src.capabilities.swim.CanSwim;

public class PfeifenteEnte extends Duck
{
    @Override
    public void display()
    {
        System.out.println("PfeifenteEnte display");
    }

    public PfeifenteEnte()
    {
        super(new CanSwim(), new CanFly(), new CantQuak());
    }
}
