package upn_rechner_my_solution.src.expressions;

import lombok.AllArgsConstructor;
import upn_rechner_my_solution.src.Expression;

@AllArgsConstructor
public class MultiplicationExpression implements Expression
{
    private Expression left, right;

    @Override
    public int interpret()
    {
        return this.left.interpret() * this.right.interpret();
    }
    @Override
    public String getUPN() {
        return left.getUPN()+right.getUPN()+"* ";
    }
}
