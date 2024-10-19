package SimUDuckApp.src.capabilities.fly;

public class CantFly implements FlyCapability
{
    @Override
    public void fly()
    {
        System.out.println("Can't fly");
    }
}
