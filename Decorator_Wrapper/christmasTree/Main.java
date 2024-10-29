package christmasTree;

import christmasTree.src.base.ChristmasTree;
import christmasTree.src.decorators.BubbleLights;
import christmasTree.src.decorators.Garland;
import christmasTree.src.decorators.Tinsel;
import christmasTree.src.trees.ChristmasTreeImpl;

public class Main
{
    public static void main(String[] args)
    {

        ChristmasTree tree = new Tinsel(new Garland(new BubbleLights(new ChristmasTreeImpl())));
        ChristmasTree tree1 = new Garland(new ChristmasTreeImpl());

        System.out.println("tree : "+ tree.decorate());

        System.out.println("tree1 : "+ tree1.decorate());

    }
}
