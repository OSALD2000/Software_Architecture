package pizzaFactory.src.base;

public abstract class Restaurant
{
    protected SimpleFactory factory;

    public Restaurant(SimpleFactory factory)
    {
        this.factory = factory;
    }

    public Pizza orderPizza(String type)
    {
        Pizza pizza = this.factory.createPizza(type);

        pizza.bake();
        pizza.cut();
        pizza.pack();

        return pizza;
    }

}
