package wordinspection;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordInspection
{
    private File file;

    public WordInspection(File file)
    {
        this.file = file;
    }

    public int wordCount()
    {
        int count = 0;
        Scanner reader = null;

        try
        {
            reader = new Scanner(file, "UTF-8");

            while (reader.hasNext())
            {
                count++;
                reader.next();
            }
        }
        catch (FileNotFoundException ex)
        {
            System.out.println(ex);
        }
        finally
        {
            if(reader != null)
            {
                reader.close();
            }
        }

        return count;
    }

    public List<String> wordsContainingZ()
    {
        List<String> words = new ArrayList<String>();
        Scanner reader = null;

        try
        {
            reader = new Scanner(file, "UTF-8");

            while (reader.hasNext())
            {
                String word = reader.next();

                if (word.contains("z"))
                {
                    words.add(word);
                }
            }
        }
        catch (FileNotFoundException ex)
        {
            System.out.println(ex);
        }
        finally
        {
            if(reader != null)
            {
                reader.close();
            }
        }

        return words;
    }

    public List<String> wordsEndingInL()
    {
        List<String> words = new ArrayList<String>();
        Scanner reader = null;

        try
        {
            reader = new Scanner(file, "UTF-8");

            while (reader.hasNext())
            {
                String word = reader.next();

                if (word.substring(word.length() - 1).equals("l"))
                {
                    words.add(word);
                }
            }
        }
        catch (FileNotFoundException ex)
        {
            System.out.println(ex);
        }
        finally
        {
            if(reader != null)
            {
                reader.close();
            }
        }

        return words;
    }

    public List<String> palindromes()
    {
        List<String> words = new ArrayList<String>();
        Scanner reader = null;

        try
        {
            reader = new Scanner(file, "UTF-8");

            while (reader.hasNext())
            {
                String reversed = "";
                String word = reader.next();

                for (int i = word.length() - 1; i > -1; i--)
                {
                    reversed += word.substring(i, i + 1);
                }

                if (word.equals(reversed))
                {
                    words.add(word);
                }
            }
        }
        catch (FileNotFoundException ex)
        {
            System.out.println(ex);
        }
        finally
        {
            if(reader != null)
            {
                reader.close();
            }
        }

        return words;
    }

    public List<String> wordsWhichContainAllVowels()
    {
        List<String> words = new ArrayList<String>();
        String vowels  = "aeiouyäö";
        Scanner reader = null;

        try
        {
            reader = new Scanner(file, "UTF-8");
            boolean hasPassedChars = false;
            boolean isVowel = false;

            while (reader.hasNext())
            {
                String word = reader.next();

                for (char vowel : vowels.toCharArray())
                {
                    hasPassedChars = true;

                    for (int i = 0; i < word.length(); i++)
                    {
                        if (vowel == word.charAt(i))
                        {
                            isVowel = true;
                            break;
                        }
                    }

                    if (!isVowel)
                    {
                        hasPassedChars = false;
                        break;
                    }

                    isVowel = false;
                }

                if (hasPassedChars)
                {
                    words.add(word);
                }
            }
        }
        catch (FileNotFoundException ex)
        {
            System.out.println(ex);
        }
        finally
        {
            if(reader != null)
            {
                reader.close();
            }
        }

        return words;
    }
}