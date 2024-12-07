package upn_rechner_my_solution.src;


import java.util.ArrayList;

/**
 *  Algorithm:
 *  1. start on the right side of the equals calculation
 *  2. go to the first changed operation to the right
 *  3. write the numbers until the first changed operation in UPN form
 *  4. if the calculation is not done go to 2
 *  5. else done!
 */

public class Main
{
    public static void main(String[] args)
    {
        Parser upnRechner = new Parser();


        String calculation = "221 + 133 + 3 * 2 + 2 * 2 * 10 + 2 * 2 + 5 - 6 / 5";
        Expression upn = upnRechner.parse(calculation);

        System.out.println(upn.interpret());

        System.out.println(upn.getUPN());
    }
}
