package interpreter_simple.src;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PlusExpression implements Expression
{
    private Expression left, right;


    public int interpret()
    {
        return left.interpret() + right.interpret();
    }
}
