package SimUDuckApp.src.capabilities.swim;

public class CantSwim implements SwimCapability
{
    @Override
    public void swim()
    {
        System.out.println("Can't swim");
    }
}
