package interpreter_simple.src;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class MultiplicationExpression implements Expression
{
    private Expression left, right;

    @Override
    public int interpret()
    {
        return left.interpret()*right.interpret();
    }
}
