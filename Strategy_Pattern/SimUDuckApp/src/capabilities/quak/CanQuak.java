package SimUDuckApp.src.capabilities.quak;

public class CanQuak implements QuakCapability
{
    @Override
    public void qack()
    {
        System.out.println("Can Quak");
    }
}
