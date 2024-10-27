package pattern.src.base;

public abstract class Decorator extends Component
{
    private Component component;
    private Class<? extends Component> componentClass;

    public Component getComponent()
    {
        return component;
    }

    public void setComponent(Component component)
    {
        this.component = component;
    }

    public Class<? extends Component> getComponentClass()
    {
        return componentClass;
    }

    public void setComponentClass(Class<? extends Component> componentClass)
    {
        this.componentClass = componentClass;
    }
}
