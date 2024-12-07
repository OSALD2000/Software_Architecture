
public class PoM implements Container {
    private MovieCharacter characters[] = new MovieCharacter[8];
    private int index = 0;

    PoM()
    {
        characters[0] = new MovieCharacter("Skipper");
        characters[1] = new MovieCharacter("Private");
        characters[2] = new MovieCharacter("Kowalski");
        characters[3] = new MovieCharacter("Rico");
        characters[4] = new MovieCharacter("Mort");
        characters[5] = new MovieCharacter("King Julian");
        characters[6] = new MovieCharacter("Maurice");
        characters[7] = new MovieCharacter("Marlene");
    }

    public MovieCharacter[] getActors() {return characters;}

    @Override
    public Iterator getIterator()
    {
        return null;
    }
}
