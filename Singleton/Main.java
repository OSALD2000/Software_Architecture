import example.src.Druker;

import java.util.Arrays;

public class Main extends Thread
{
    public Main(String name)
    {
        super(name);
    }

    @Override
    public void run()
    {
        String[] listPdfs = new String[]{
                "pdf1",
                "pdf2",
                "pdf3",
                "pdf4",
                "pdf5",
        };

        Arrays.stream(listPdfs).forEach(string ->
        {
            Druker.getInstance().print(getName(), string);
        });
    }

    public static void main(String[] args)
    {
        Main[] list = new Main[]
                {
        new Main("Schuler 1"), new Main("Schuler 2"),
        new Main("Schuler 3"), new Main("Schuler 4"),
        new Main("Schuler 5"),
    };

        Arrays.stream(list).forEach(Main::start);

        Arrays.stream(list).forEach(thread ->
        {
            try {
                thread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });


        System.out.println("alle prints are done!");
    }
}
