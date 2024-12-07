import java.util.ArrayList;

public class Minions implements Container{
    private ArrayList<MovieCharacter> minions = new ArrayList();

    Minions()
    {
        minions.add(new MovieCharacter("Carl"));
        minions.add(new MovieCharacter("Darwin"));
        minions.add(new MovieCharacter("Dave"));
        minions.add(new MovieCharacter("Donny"));
        minions.add(new MovieCharacter("Jerry"));
        minions.add(new MovieCharacter("Kevin"));
        minions.add(new MovieCharacter("Stuart"));
    }

    public ArrayList<MovieCharacter> allMinions()
    {
        return minions;
    }


    @Override
    public Iterator getIterator()
    {
        return new MinionsIterator(minions);
    }
}
