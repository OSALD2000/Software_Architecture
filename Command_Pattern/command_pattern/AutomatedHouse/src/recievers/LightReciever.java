package command_pattern.AutomatedHouse.src.recievers;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class LightReciever
{
    private String room;

    public void on()
    {
        System.out.println("Light on in room " + room);
    }

    public void off()
    {
        System.out.println("Light off in room " + room);
    }
}
