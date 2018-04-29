package dictionary;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PersonalMultipleEntryDictionary implements MultipleEntryDictionary
{
    private Map<String, Set<String>> dictionary;

    public PersonalMultipleEntryDictionary()
    {
        this.dictionary = new HashMap<String, Set<String>>();
    }

    @Override
    public void add(String word, String entry)
    {
        if (!this.dictionary.containsKey(word))
        {
            this.dictionary.put(word, new HashSet<String>());
        }

        Set<String> newEntry = this.dictionary.get(word);
        newEntry.add(entry);
    }

    @Override
    public Set<String> translate(String word)
    {
        Set<String>  result = null;

        if(this.dictionary.containsKey(word))
        {
            result = this.dictionary.get(word);
        }

        return result;
    }

    @Override
    public void remove(String word)
    {
        if (this.dictionary.containsKey(word))
        {
            this.dictionary.remove(word);
        }
    }
}