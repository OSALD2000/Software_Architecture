package interpreter_simple.src;

import lombok.AllArgsConstructor;


@AllArgsConstructor
public class SubtractionExpression implements Expression
{
    private Expression left, right;

    @Override
    public int interpret()
    {
        return left.interpret()-right.interpret();
    }
}
