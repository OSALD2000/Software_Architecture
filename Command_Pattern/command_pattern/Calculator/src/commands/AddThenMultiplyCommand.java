package command_pattern.Calculator.src.commands;

import command_pattern.Calculator.src.base.Command;

public class AddThenMultiplyCommand implements Command
{
    private Command multiplyCommand;
    private Command addCommand;

    public AddThenMultiplyCommand(double num1, double num2)
    {
        this.multiplyCommand = new MultiplyCommand(num1);
        this.addCommand = new AddCommand(num2);
    }

    @Override
    public double execute(double currentValue)
    {
        return multiplyCommand.execute(addCommand.execute(currentValue));
    }

    @Override
    public double undo(double currentValue)
    {
        return addCommand.undo(multiplyCommand.undo(currentValue));
    }
}
