package src;


import lombok.AllArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
public class Director
{
    @Setter
    private HausBuilder builder;

    public void build(String type)
    {
        if (type.equals("Roof_frist"))
        {
            builder.reset();
            System.out.println("Setup walls");
            builder.setupWalls();
            System.out.println("Setup roof");
            builder.setupRoof();
            System.out.println("Setup windows");
            builder.setupWindows();
        }else
        {
            builder.reset();
            builder.setupWalls();
            System.out.println("Setup walls");
            builder.setupWindows();
            System.out.println("Setup windows");
            builder.setupRoof();
            System.out.println("Setup roof");
        }
    }
}
