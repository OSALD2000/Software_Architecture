package command_pattern.AutomatedHouse.src.recievers;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class HeatingReciever
{
    private String room;

    public void on()
    {
        System.out.println("Heating on in room " + room);
    }

    public void off()
    {
        System.out.println("Heating off in room " + room);
    }
}