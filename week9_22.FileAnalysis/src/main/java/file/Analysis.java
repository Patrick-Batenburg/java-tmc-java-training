package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Analysis
{
    private File file;

    public Analysis(File file)
    {
        this.file = file;
    }

    public int lines()
    {
        int count = 0;
        Scanner reader = null;

        try
        {
            reader = new Scanner(file, "UTF-8");

            while (reader.hasNextLine())
            {
                count++;
                reader.nextLine();
            }
        }
        catch (FileNotFoundException ex)
        {
            System.out.println(ex);
        }
        finally
        {
            reader.close();
        }

        return count;
    }

    public int characters()
    {
        int count = 0;
        Scanner reader = null;

        try
        {
            reader = new Scanner(file, "UTF-8");

            while (reader.hasNextLine())
            {
                String word = reader.nextLine();
                count++;
                
                for(char c : word.toCharArray())
                {
                    count++;
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

        return count;
    }
}