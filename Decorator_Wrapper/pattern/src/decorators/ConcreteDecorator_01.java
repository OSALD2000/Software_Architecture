package pattern.src.decorators;

import pattern.src.base.Component;
import pattern.src.base.Decorator;

public class ConcreteDecorator_01 extends Decorator
{
    @Override
    public void render()
    {
        this.getComponent().render();
        System.out.println("ConcreteDecorator_01 render");
    }
}
