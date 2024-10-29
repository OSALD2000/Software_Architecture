package pizzaFactoryV2.src.base;

public abstract class Pizza
{
    public abstract String getDescription();
    public abstract String getType();
    public abstract double cost();

    public void cut()
    {
        System.out.println("Cutting the " + getType());
    }

    public void pack()
    {
        System.out.println("Packing the "+ getType());
    }

    public void back()
    {
        System.out.println("Backing the "+ getType());
    }
}
