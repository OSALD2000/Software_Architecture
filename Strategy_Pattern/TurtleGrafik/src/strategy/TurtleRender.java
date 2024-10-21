package TurtleGrafik.src.strategy;

public class TurtleRender
{
    private TurtleRendererStrategy client;

    public TurtleRender(TurtleRendererStrategy client)
    {
        this.client = client;
    }

    public TurtleRendererStrategy getClient()
    {
        return client;
    }

    public void setClient(TurtleRendererStrategy client)
    {
        this.client = client;
    }

    public void render()
    {
        this.client.render();
    }

    public void drawLine(int x1, int y1, int x2, int y2)
    {
        client.drawLine(x1, y1, x2, y2);
    }

    public void setPenUp()
    {
        client.setPenUp();
    }

    public void setPenDown()
    {
        client.setPenDown();
    }
}
