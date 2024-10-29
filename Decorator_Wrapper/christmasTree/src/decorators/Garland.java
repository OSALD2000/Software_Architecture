package christmasTree.src.decorators;

import christmasTree.src.base.ChristmasTree;
import christmasTree.src.base.TreeDecorator;
import com.sun.source.tree.Tree;

public class Garland extends TreeDecorator
{
    public Garland(ChristmasTree tree)
    {
        super(tree);
    }

    public String decorate()
    {
        return super.decorate() + decorateWithGarland();
    }

    private String decorateWithGarland()
    {
        return " with Garland";
    }
}
