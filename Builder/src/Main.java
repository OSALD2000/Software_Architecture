package src;

public class Main
{
    public static void main(String[] args)
    {
        ConcreteBuilder1 concreteBuilder1 = new ConcreteBuilder1();
        Director director = new Director(concreteBuilder1);

        director.build("Roof_first");

        Haus haus1 = concreteBuilder1.getResult();

        director.build("");

        Haus haus2 = concreteBuilder1.getResult();

    }
}
