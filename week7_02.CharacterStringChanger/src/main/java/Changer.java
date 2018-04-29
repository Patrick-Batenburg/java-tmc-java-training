import java.util.ArrayList;

public class Changer
{
    ArrayList<Change> changes = new ArrayList<Change>();

    public Changer()
    {

    }

    public void addChange(Change change)
    {
        changes.add(change);
    }

    public String change(String characterString)
    {
        for (Change Change : changes)
        {
            characterString = Change.change(characterString);
        }

        return characterString;
    }
}