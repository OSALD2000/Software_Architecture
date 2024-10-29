package christmasTree.src.decorators;

import christmasTree.src.base.ChristmasTree;
import christmasTree.src.base.TreeDecorator;

public class Tinsel extends TreeDecorator
{
    public Tinsel(ChristmasTree tree)
    {
        super(tree);
    }

    public String decorate()
    {
        return super.decorate() + decorateWithTinsel();
    }

    private String decorateWithTinsel()
    {
        return " with Tinsel";
    }
}
