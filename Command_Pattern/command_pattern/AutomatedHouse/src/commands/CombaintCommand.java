package command_pattern.AutomatedHouse.src.commands;

import command_pattern.AutomatedHouse.src.base.Command;

import java.util.ArrayList;

public class CombaintCommand implements Command
{
    private Command[] commands;

    public CombaintCommand(Command ... commands)
    {
        this.commands = commands;
    }

    @Override
    public void execute()
    {
        for (Command command : commands)
        {
            command.execute();
        }
    }
}
