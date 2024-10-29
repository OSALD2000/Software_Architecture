package pattern.src.decorators;

import pattern.src.base.Decorator;

public class ConcreteDecorator_101 extends Decorator
{
    @Override
    public void render()
    {
        this.getComponent().render();
        System.out.println("ConcreteDecorator_101 render");
    }
}
