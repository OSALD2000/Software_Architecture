package pizzaFactoryV2.src.base;

public abstract class PizzaDecorator extends Pizza
{
        protected Pizza decoratedPizza;

        public PizzaDecorator(Pizza decoratedPizza)
        {
            this.decoratedPizza = decoratedPizza;
        }

        @Override
        public String getDescription()
        {
            return decoratedPizza.getDescription();
        }

        @Override
        public double cost()
        {
            return decoratedPizza.cost();
        }
}
