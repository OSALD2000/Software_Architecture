package SimUDuckApp;

import SimUDuckApp.src.ducks.*;

import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        List<Duck> ducks = new ArrayList<Duck>();

        ducks.add(new DecoEnte());
        ducks.add(new PfeifenteEnte());
        ducks.add(new QuietscheEnte());
        ducks.add(new SchnatterEnte());
        ducks.add(new Stockeente());
        ducks.add(new BYOD());

        ducks.forEach(duck ->
        {
            System.out.println("Duck Art: ");
            duck.display();
            duck.swim();
            duck.fly();
            duck.quak();

            System.out.println("\n");
        });

    }
}