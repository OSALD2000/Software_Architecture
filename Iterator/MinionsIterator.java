import java.util.ArrayList;

public class MinionsIterator implements Iterator
{
    private ArrayList<MovieCharacter> characters;
    private int index;

    public MinionsIterator(ArrayList<MovieCharacter> characters)
    {
        this.characters = characters;
    }

    @Override
    public boolean hasNext()
    {
        return index < characters.size();
    }

    @Override
    public MovieCharacter getNext()
    {
        return characters.get(index++);
    }
}
