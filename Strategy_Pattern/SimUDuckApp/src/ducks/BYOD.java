package SimUDuckApp.src.ducks;

import SimUDuckApp.src.capabilities.fly.CanFly;
import SimUDuckApp.src.capabilities.fly.CantFly;
import SimUDuckApp.src.capabilities.quak.CanQuak;
import SimUDuckApp.src.capabilities.quak.CantQuak;
import SimUDuckApp.src.capabilities.swim.CanSwim;
import SimUDuckApp.src.capabilities.swim.CantSwim;

import java.util.Scanner;

public class BYOD extends Duck
{
    public BYOD()
    {
        super(null, null, null);
        build();
    }

    @Override
    public void display()
    {
        System.out.println("custom Ente !!");
    }

    private void build()
    {
        System.out.println("build your own Duck : ");
        Scanner scanner = new Scanner(System.in);

        int swimOption = 1;
        int flyOption = 1;
        int quakOption = 1;

        System.out.println("Kann dieses Ente schwimmen ? \n - JA => 1 \n - Nein => 2");

        swimOption = scanner.nextInt();

        System.out.println("Kann dieses Ente fliegen ? \n - JA => 1 \n - Nein => 2");

        flyOption = scanner.nextInt();

        System.out.println("Kann dieses Ente quaken ? \n - JA => 1 \n - Nein => 2");

        quakOption = scanner.nextInt();

        System.out.println("eine neue Ente wird erstellt mit folgenden Fauhigkeit: ");

        if (swimOption == 1)
        {
            setSwimCapability(new CanSwim());
            System.out.println("Kann schwimmen");
        }
        else
        {
            setSwimCapability(new CantSwim());
            System.out.println("Kann nicht schwimmen");
        }

        if (flyOption == 1)
        {
            setFlyCapability(new CanFly());
            System.out.println("Kann fliegen");
        }
        else
        {
            setFlyCapability(new CantFly());
            System.out.println("Kann nicht fliegen");
        }

        if (quakOption == 1)
        {
            setQuakCapability(new CanQuak());
            System.out.println("Kann quaken");
        }
        else
        {
            setQuakCapability(new CantQuak());
            System.out.println("Kann nicht quaken");
        }
    }
}

