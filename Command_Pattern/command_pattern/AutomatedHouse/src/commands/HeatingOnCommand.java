package command_pattern.AutomatedHouse.src.commands;

import command_pattern.AutomatedHouse.src.base.Command;
import command_pattern.AutomatedHouse.src.recievers.HeatingReciever;
import lombok.AllArgsConstructor;


@AllArgsConstructor
public class HeatingOnCommand implements Command
{
    private HeatingReciever reciever;

    @Override
    public void execute()
    {
        reciever.on();
    }
}