package starbucksWWS;

import starbucksWWS.base.Beverage;
import starbucksWWS.containers.Caffee;
import starbucksWWS.extras.Milch;
import starbucksWWS.extras.Mokka;

public class Main
{

    public static void main(String[] args)
    {
        Caffee caffee = new Caffee();
        Beverage newCaffe = caffee.add(Milch.class).add(Mokka.class).add(Milch.class).add(Mokka.class);

        double cost = newCaffe.calculateCost();

        System.out.println(cost);
    }
}
