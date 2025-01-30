
public class Main {

    public static void main(String[] args)
    {
        PoM poM = new PoM();
        Minions minions = new Minions();

        System.out.println("Die wichtigsten Minions");
        // Code to print out Minions
        Iterator itr = minions.getIterator();
        while (itr.hasNext()) System.out.println(itr.getNext().getName());

        System.out.println("Code to print the charactes of PoM");
        // Code to print the charactes of PoM
        Iterator itr2 = poM.getIterator();

        while (itr2.hasNext()) System.out.println(itr2.getNext().getName());


    }
}