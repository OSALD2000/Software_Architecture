package pizzaFactoryV2.src.restaurants.dubai.data;

public enum DUBAI_PIZZA_SORT
{
    SALAMI_PIZZA_DUBAI("Salami Pizza Dubai","Salami pizza Hof with Halal Salami", 7.0);

    private final String sort;
    private final String description;
    private final double cost;

    DUBAI_PIZZA_SORT(String sort, String description, double cost)
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
