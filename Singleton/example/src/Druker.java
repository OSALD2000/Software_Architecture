package example.src;

public class Druker
{
    private static Druker instance;

    private Druker()
    {
    }

    public static Druker getInstance()
    {
        if (instance == null)
        {
            instance = new Druker();
        }

        return instance;
    }

    public synchronized void print(String client, String pdf)
    {
        int timeNeeded = (int) (Math.random() * 10000);
        System.out.println("client: " + client + " printing pdf: " + pdf + " time: " + timeNeeded+ " ms");

        try {
            Thread.sleep(timeNeeded);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("client: " + client + " printing pdf: " + pdf + " done ");
    }
}
