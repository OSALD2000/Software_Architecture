package command_pattern.Calculator;

import command_pattern.Calculator.src.Calculator;
import command_pattern.Calculator.src.commands.AddCommand;
import command_pattern.Calculator.src.commands.DivideCommand;
import command_pattern.Calculator.src.commands.MultiplyCommand;
import command_pattern.Calculator.src.commands.SubtractCommand;

public class Main
{
    public static void main(String[] args)
    {
        Calculator calc = new Calculator();
        calc.executeCommand(new AddCommand(10.0d));
        calc.executeCommand(new AddCommand(10.0d));
        calc.executeCommand(new AddCommand(10.0d));
        calc.executeCommand(new AddCommand(10.0d));
        calc.executeCommand(new AddCommand(10.0d));
        calc.executeCommand(new MultiplyCommand(10.0d));
        calc.executeCommand(new MultiplyCommand(10.0d));
        calc.executeCommand(new MultiplyCommand(10.0d));
        calc.executeCommand(new DivideCommand(10.0d));
        calc.executeCommand(new DivideCommand(10.0d));
        calc.executeCommand(new DivideCommand(10.0d));
        calc.executeCommand(new DivideCommand(10.0d));
        calc.executeCommand(new SubtractCommand(10.0d));

        System.out.println(calc.getValue());

        while (calc.getHistory().size() > 0)
        {
            calc.undo();
        }

        System.out.println(calc.getValue());
    }
}
