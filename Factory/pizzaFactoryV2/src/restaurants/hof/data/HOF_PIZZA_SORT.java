package pizzaFactoryV2.src.restaurants.hof.data;


public enum HOF_PIZZA_SORT
{
    DIAVOLO_PIZZA_HOF("Diavolo Pizza Hof","Diavolo pizza Hof with special extras", 10.5);

    private final String sort;
    private final String description;
    private final double cost;

    HOF_PIZZA_SORT(String sort, String description, double cost)
    {
        this.sort = sort;
        this.cost = cost;
        this.description = description;
    }

    public String getSort()
    {
        return this.sort;
    }

    public double getCost()
    {
        return this.cost;
    }

    public String getDescription()
    {
        return this.description;
    }
}
