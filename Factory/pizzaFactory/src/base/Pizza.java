package pizzaFactory.src.base;

public abstract class Pizza
{
    private String type;
    private double cost;

    public Pizza(String type, double cost)
    {
        this.type = type;
        this.cost = cost;
    }

    public void bake()
    {
        System.out.println("Bake on "+type);
    };

    public void cut()
    {
        System.out.println("Cutting on "+type);
    }

    public void pack()
    {
        System.out.println("Packing on "+type);
    }

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public double getCost()
    {
        return cost;
    }

    public void setCost(double cost)
    {
        this.cost = cost;
    }
}
