package command_pattern.AutomatedHouse.src.commands;

import command_pattern.AutomatedHouse.src.base.Command;
import command_pattern.AutomatedHouse.src.recievers.LightReciever;
import lombok.AllArgsConstructor;


@AllArgsConstructor
public class LightOnCommand implements Command
{
    private LightReciever reciever;

    @Override
    public void execute()
    {
        reciever.on();
    }
}
