package christmasTree.src.decorators;

import christmasTree.src.base.ChristmasTree;
import christmasTree.src.base.TreeDecorator;

public class TreeTropper extends TreeDecorator
{
    public TreeTropper(ChristmasTree tree)
    {
        super(tree);
    }

    public String decorate()
    {
        return super.decorate() + decorateWithTreeTropper();
    }

    private String decorateWithTreeTropper()
    {
        return " with TreeTropper";
    }
}
