package command_pattern.Calculator.src.commands;

import command_pattern.Calculator.src.base.Command;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class DivideCommand implements Command
{

   private double value;

    @Override
    public double execute(double currentValue)
    {
        return currentValue  / this.value;
    }

    @Override
    public double undo(double currentValue)
    {
        return currentValue * this.value ;
    }
}