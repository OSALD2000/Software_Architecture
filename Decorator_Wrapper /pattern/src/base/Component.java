package pattern.src.base;

import java.lang.reflect.Constructor;

public abstract class Component
{
    public Component warp(Class<? extends Decorator> decoratorClass)
    {
        try {
            Constructor<? extends Decorator> constructor = decoratorClass.getDeclaredConstructor();
            Decorator decorator = constructor.newInstance();
            decorator.setComponent(this);
            decorator.setComponentClass(this.getClass());

            return decorator;
        }
        catch (Exception e)
        {
            throw new RuntimeException(e);
        }
    };

    public abstract void render();
}
