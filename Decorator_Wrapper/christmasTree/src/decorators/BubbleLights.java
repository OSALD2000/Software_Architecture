package christmasTree.src.decorators;

import christmasTree.src.base.ChristmasTree;
import christmasTree.src.base.TreeDecorator;

public class BubbleLights extends TreeDecorator
{
    public BubbleLights(ChristmasTree tree)
    {
        super(tree);
    }

    public String decorate()
    {
        return super.decorate() + decorateWithBubbleLights();
    }

    private String decorateWithBubbleLights()
    {
        return " with Bubble Lights";
    }
}
