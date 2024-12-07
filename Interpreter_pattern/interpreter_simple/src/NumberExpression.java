package interpreter_simple.src;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class NumberExpression implements Expression
{
    private int value;


    public int interpret()
    {
        return this.value;
    }
}
