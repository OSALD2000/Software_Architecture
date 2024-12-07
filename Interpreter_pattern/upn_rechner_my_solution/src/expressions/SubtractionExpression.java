package upn_rechner_my_solution.src.expressions;

import lombok.AllArgsConstructor;
import upn_rechner_my_solution.src.Expression;


@AllArgsConstructor
public class SubtractionExpression implements Expression
{
    private Expression left, right;

    @Override
    public int interpret()
    {
        return left.interpret()-right.interpret();
    }

    @Override
    public String getUPN() {
        return left.getUPN()+right.getUPN()+"- ";
    }
}
