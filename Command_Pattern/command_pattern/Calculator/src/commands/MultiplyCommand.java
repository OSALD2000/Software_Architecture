package command_pattern.Calculator.src.commands;

import command_pattern.Calculator.src.base.Command;
import lombok.AllArgsConstructor;


@AllArgsConstructor
public class MultiplyCommand implements Command
{

    private double value;

    @Override
    public double execute(double currentValue)
    {
        return this.value  * currentValue;
    }

    @Override
    public double undo(double currentValue)
    {
        return currentValue / this.value ;
    }
}
