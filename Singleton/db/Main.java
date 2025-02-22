package db;

import db.src.api.DatabaseAPI;
import db.src.persistence.DB;

import java.util.ArrayList;
import java.util.List;

public class Main extends Thread
{

    private int offset;

    public Main(String name, int offset)
    {
        super(name);
        this.offset = offset;
    }

    @Override
    public void run()
    {
        System.out.println(getName() + " started");

        for (int i = 0; i < 4; i++)
        {
            System.out.println(getName() + " is saving : " + (i + offset));
            DB.INSTANCE.saveNewAlter(i + offset);
            System.out.println(
                    getName() + " is testing : " + DB.INSTANCE.getAlter() + " im Ruhestand ? " + DB.INSTANCE.isPersonImRuhestand()
            );
        }
    }

    public static void main(String[] args)
    {
        DatabaseAPI db = DB.INSTANCE;
        List<Main> workers = new ArrayList<>()
        {
            {
                add(new Main("worker1", 1));
                add(new Main("worker2", 2));
                add(new Main("worker3", 3));
                add(new Main("worker4", 4));
                add(new Main("worker5", 5));
                add(new Main("worker6", 6));
            }
        };

        workers.forEach(Thread::start);

        workers.forEach(t ->
        {
            try {
                t.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        System.out.println("Worker are done");
        System.out.println(DB.INSTANCE.getAlter());

    }
}