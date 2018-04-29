import java.util.ArrayList;
import java.util.HashMap;

public class Dictionary
{
    private HashMap<String, String> dictionary;

    /**
     * Initializes a new instance of the Dictionary class.
     */
    public Dictionary()
    {
        this.dictionary = new HashMap<String, String>();
    }

    /**
     * Retrieve the English translation of Finnish words.
     *
     * @param word  The word to translate,
     * @return      The translation of its parameter. If the word is unknown, it returns null.
     */
    public String translate(String word)
    {
        String result = null;

        if(this.dictionary.containsKey(word))
        {
            result = this.dictionary.get(word);
        }

        return result;
    }

    /**
     * Adds a new translation to the dictionary.
     * @param word          Word to translate.
     * @param translation   Translates word to add to the dictionary.
     */
    public void add(String word, String translation)
    {
        this.dictionary.put(word, translation);
    }

    /**
     * Counts the amount of words in the dictionary.
     * @return  The amount of words in the dictionary.
     */
    public int amountOfWords()
    {
        return dictionary.size();
    }

    /**
     * Gets all the items in the dictionary.
     *
     * @return  A content list of all items in the dictionary.
     */
    public ArrayList<String> translationList()
    {
        ArrayList<String> translationList = new ArrayList<String>();

        for (String key : this.dictionary.keySet())
        {
            translationList.add(String.format("%s = %s", key, this.dictionary.get(key)));
        }

        return translationList;
    }
}