package command_pattern.Calculator.src;

import command_pattern.Calculator.src.base.Command;
import lombok.Getter;

import java.util.ArrayList;

@Getter
public class Calculator
{
    private double value;
    private ArrayList<Command> history;

    public Calculator()
    {
        this.value = 0;
        this.history = new ArrayList<>();
    }

    public void executeCommand(Command command)
    {
        this.value = command.execute(value);
        this.history.add(command);
    }

    public void undo()
    {
        Command command = history.removeLast();
        this.value = command.undo(value);
    }


}
