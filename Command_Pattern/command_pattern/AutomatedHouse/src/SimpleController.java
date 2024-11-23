package command_pattern.AutomatedHouse.src;

import command_pattern.AutomatedHouse.src.base.Command;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SimpleController
{
    private Command leftCommand;
    private Command rightCommand;

    public void pressLeft()
    {
        leftCommand.execute();
    }

    public void pressRight()
    {
        rightCommand.execute();
    }
}
