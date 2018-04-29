package dictionary;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class MindfulDictionary
{
    private Map<String, String> dictionary;
    private String file;

    public MindfulDictionary()
    {
        this.dictionary = new HashMap<String, String>();
    }

    public MindfulDictionary(String file)
    {
        this.dictionary = new HashMap<String, String>();
        this.file = file;
    }

    public void add(String word, String translation)
    {
        if (!this.dictionary.containsKey(word))
        {
            this.dictionary.put(word, translation);
        }
    }

    public String translate(String word)
    {
        if (this.dictionary.containsKey(word))
        {
            return this.dictionary.get(word);
        }
        else if (this.dictionary.containsValue(word))
        {
            for (String key : this.dictionary.keySet())
            {
                if (this.dictionary.get(key).equals(word))
                {
                    return key;
                }
            }
        }

        return null;
    }

    public void remove(String word)
    {
        if (this.dictionary.containsKey(word))
        {
            this.dictionary.remove(word);
        }
        if (this.dictionary.containsValue(word))
        {
            List<String> keys = new ArrayList<String>();

            for (String key : this.dictionary.keySet())
            {
                if (this.dictionary.get(key).equals(word))
                {
                    keys.add(key);
                }
            }

            for (String key : keys)
            {
                this.dictionary.remove(key);
            }
        }
    }

    public boolean load()
    {
        try
        {
            File f = new File(this.file);

            Scanner fileReader = new Scanner(f);

            while (fileReader.hasNextLine())
            {
                String line = fileReader.nextLine();
                String[] parts = line.split(":");
                this.dictionary.put(parts[0], parts[1]);
            }

            fileReader.close();
            return true;
        }
        catch (FileNotFoundException ex)
        {
            return false;
        }
    }

    public boolean save()
    {
        FileWriter writer;

        try
        {
            writer = new FileWriter(new File(this.file));

            for (String key : this.dictionary.keySet())
            {
                writer.write(key + ":" + this.dictionary.get(key) + "\n");
            }

            writer.close();
            return true;
        }
        catch (IOException ex)
        {
            return false;
        }
    }
}