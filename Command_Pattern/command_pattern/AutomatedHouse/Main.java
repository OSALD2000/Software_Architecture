package command_pattern.AutomatedHouse;

import command_pattern.AutomatedHouse.src.SimpleController;
import command_pattern.AutomatedHouse.src.commands.*;
import command_pattern.AutomatedHouse.src.recievers.HeatingReciever;
import command_pattern.AutomatedHouse.src.recievers.LightReciever;

public class Main
{
    public static void main(String[] args)
    {
        HeatingReciever room1Heating = new HeatingReciever("room1");
        HeatingReciever room2Heating = new HeatingReciever("room2");
        HeatingReciever room3Heating = new HeatingReciever("room3");

        LightReciever room1Light = new LightReciever("room1");
        LightReciever room2Light = new LightReciever("room2");
        LightReciever room3Light = new LightReciever("room3");

        //        SimpleController simpleController1 = new SimpleController(new HeatingOnCommand(room1Heating), new HeatingOffCommand(room1Heating));
        //
        //        simpleController1.pressLeft();
        //        simpleController1.pressRight();
        //        simpleController1.pressLeft();
        //

        SimpleController simpleController2 = new SimpleController(
                new CombaintCommand(
                        new LightOnCommand(room1Light), new LightOnCommand(room2Light), new LightOnCommand(room3Light),
                        new HeatingOnCommand(room1Heating), new HeatingOnCommand(room2Heating), new HeatingOnCommand(room3Heating)),
                new CombaintCommand(
                        new LightOffCommand(room1Light), new LightOffCommand(room2Light), new LightOffCommand(room3Light),
                        new HeatingOffCommand(room1Heating), new HeatingOffCommand(room2Heating), new HeatingOffCommand(room3Heating))
                );

        simpleController2.pressLeft();
        simpleController2.pressRight();
    }
}
