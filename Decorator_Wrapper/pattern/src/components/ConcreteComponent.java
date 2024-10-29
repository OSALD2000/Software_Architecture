package pattern.src.components;

import pattern.src.base.Component;

public class ConcreteComponent extends Component
{
    @Override
    public void render()
    {
        System.out.println("ConcreteComponent render");
    }
}
