package interpreter_simple.src;

public class Main
{
    /**
     *                  Baum
     *         +                    1
     *    3         4
     * **/

    /**
     *                         Baum
     *                   -              3
     *             *          3
     *        +        3
     *    3      4
     * **/

    public static void main(String[] args)
    {

        // 3 + 4 + 1 --> 3 4 + 1 +
        NumberExpression d = new NumberExpression(3);
        NumberExpression v = new NumberExpression(4);
        PlusExpression add = new PlusExpression(d,v);
        NumberExpression e = new NumberExpression(1);
        PlusExpression add2 = new PlusExpression(add, e);
        MultiplicationExpression mul = new MultiplicationExpression(d,add2);
        SubtractionExpression sub = new SubtractionExpression(d,mul);

        int res = sub.interpret();

        System.out.println("Ergebnis:" + res);
    }
}