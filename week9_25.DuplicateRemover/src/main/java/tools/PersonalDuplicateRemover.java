package tools;

import java.util.HashSet;
import java.util.Set;

public class PersonalDuplicateRemover implements DuplicateRemover
{
    private Set<String> strings;
    private int amountOfDuplicates;

    public PersonalDuplicateRemover()
    {
        this.strings = new HashSet<String>();
        amountOfDuplicates = 0;
    }

    @Override
    public void add(String characterString)
    {
        if (!this.strings.contains(characterString))
        {
            this.strings.add(characterString);
        }
        else
        {
            amountOfDuplicates++;
        }
    }

    @Override
    public int getNumberOfDetectedDuplicates()
    {
        return amountOfDuplicates;
    }

    @Override
    public Set<String> getUniqueCharacterStrings()
    {
        return strings;
    }

    @Override
    public void empty()
    {
        strings.clear();
        amountOfDuplicates = 0;
    }
}