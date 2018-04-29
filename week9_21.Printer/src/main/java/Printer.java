import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Printer
{
    private File file;
    private Scanner reader;

    public Printer(String fileName) throws Exception
    {
        file = new File(fileName);
    }

    public void printLinesWhichContain(String word)
    {
        String string = "";

        try
        {
            reader = new Scanner(file, "UTF-8");
            
            while (reader.hasNextLine())
            {
                String line = reader.nextLine();

                if (line.contains(word))
                {
                    string = line;
                    System.out.println(string);
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
    }
}