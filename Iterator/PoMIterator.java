
public class PoMIterator implements Iterator
{
    private MovieCharacter[] characters;
    private int index;

    public PoMIterator(MovieCharacter[] character)
    {
        this.characters = character;
    }

    @Override
    public boolean hasNext()
    {
        return index < characters.length;
    }

    @Override
    public MovieCharacter getNext()
    {
        return characters[index++];
    }
}
