package upn_rechner_my_solution.src.expressions;

import lombok.AllArgsConstructor;
import upn_rechner_my_solution.src.Expression;

@AllArgsConstructor
public class NumberExpression implements Expression
{
    private int value;

    @Override
    public int interpret()
    {
       return value;
    }

    @Override
    public String getUPN() {
        return this.value +" ";
    }
}

