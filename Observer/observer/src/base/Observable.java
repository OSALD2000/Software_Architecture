package observer.src.base;

import java.util.ArrayList;
import java.util.List;

public abstract class Observable
{
    private final List<Observer> observers;
    protected Data data;
    
    public Observable(Data data)
    {
        this.observers = new ArrayList<Observer>();
        this.data = data;
    }

    public void addObserver(Observer observer)
    {
        this.observers.add(observer);
    }
    
    public void removeObserver(Observer observer)
    {
        this.observers.remove(observer);
    }
    
    protected void doUpdate()
    {
        observers.forEach(o -> o.update(this.data));
    }

}
