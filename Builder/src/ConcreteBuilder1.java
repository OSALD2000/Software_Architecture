package src;

public class ConcreteBuilder1 implements HausBuilder
{
    private Haus haus;

    @Override
    public void setupWalls()
    {
        haus.setWalls("Walls ConcreteBuilder1");
    }

    @Override
    public void setupWindows()
    {
        haus.setWindows("Windows ConcreteBuilder1");
    }

    @Override
    public void setupRoof()
    {
        haus.setRoof("Roof ConcreteBuilder1");
    }

    @Override
    public void reset()
    {
        this.haus = new Haus();
    }

    public Haus getResult()
    {
        return haus;
    }
}
