import java.util.List;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args)
    {
        Consumer<? super MovieCharacter> consumer = m -> System.out.println(m.getName());

        PoM poM = new PoM();
        Minions minions = new Minions();

        System.out.println("Die wichtigsten Minions");
        // Code to print out Minions
        Iterator itr = minions.getIterator();
        while (itr.hasNext()) System.out.println(itr.getNext().getName());

        System.out.println("Code to print the charactes of PoM");
        // Code to print the charactes of PoM

    }
}