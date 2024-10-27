package pattern;

import pattern.src.base.Component;
import pattern.src.components.ConcreteComponent;
import pattern.src.decorators.ConcreteDecorator_01;
import pattern.src.decorators.ConcreteDecorator_101;
import pattern.src.decorators.ConcreteDecorator_33;

public class Main
{
    public static void main(String[] args)
    {
        ConcreteComponent concreteComponent = new ConcreteComponent();

        Component decoratoredComponent = (concreteComponent.warp(ConcreteDecorator_01.class)).warp(ConcreteDecorator_33.class).warp(ConcreteDecorator_101.class);

        decoratoredComponent.render();
    }
}
