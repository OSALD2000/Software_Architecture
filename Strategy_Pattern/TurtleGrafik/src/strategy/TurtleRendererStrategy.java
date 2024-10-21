package TurtleGrafik.src.strategy;

public interface TurtleRendererStrategy
{
    public void render();
    public void drawLine(int x1, int y1, int x2, int y2);
    public void setPenUp();
    public void setPenDown();
    public boolean getPenDown();
}
