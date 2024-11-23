package command_pattern.AutomatedHouse.src.commands;

import command_pattern.AutomatedHouse.src.base.Command;
import command_pattern.AutomatedHouse.src.recievers.HeatingReciever;
import lombok.AllArgsConstructor;


@AllArgsConstructor
public class HeatingOffCommand implements Command
{
    private HeatingReciever reciever;

    @Override
    public void execute()
    {
        reciever.off();
    }
}
