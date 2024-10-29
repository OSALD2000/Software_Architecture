package starbucksWWS.base;

public abstract class Decorator extends Beverage
{
    private Beverage beverage;

    @Override
    public double calculateCost()
    {
        return getCost() + beverage.calculateCost();
    }

    public void setBeverage(Beverage beverage)
    {
        this.beverage = beverage;
    }

    public Beverage getBeverage()
    {
        return this.beverage;
    }
}
