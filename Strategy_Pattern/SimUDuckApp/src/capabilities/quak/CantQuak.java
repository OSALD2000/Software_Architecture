package SimUDuckApp.src.capabilities.quak;

public class CantQuak implements QuakCapability
{
    @Override
    public void qack()
    {
        System.out.println("Can't quak");
    }
}
