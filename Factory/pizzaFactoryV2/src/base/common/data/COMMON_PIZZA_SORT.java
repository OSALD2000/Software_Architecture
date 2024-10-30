package pizzaFactoryV2.src.base.common.data;

public enum COMMON_PIZZA_SORT
{
    PLAN_PIZZA("Plan Pizza", "this is a standard Plan Pizza",7.0),
    SALAMI_PIZZA("Salami Pizza","this is a standard Salami Pizza", 9.0),
    DIAVOLO_PIZZA("Diavolo Pizza","this is a standard Diavolo Pizza", 10.0);

    private final String sort;
    private final String description;
    private final double cost;

    COMMON_PIZZA_SORT(String sort, String description, double cost)
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
