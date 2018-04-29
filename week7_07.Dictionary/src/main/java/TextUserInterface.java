import java.util.Scanner;

public class TextUserInterface
{
    private Dictionary dictionary;
    private Scanner reader;

    /**
     * Initializes a new instance of the Dictionary class.
     *
     * @param reader        Reads the user input.
     * @param dictionary    Stores the translations.
     */
    public TextUserInterface(Scanner reader, Dictionary dictionary)
    {
        this.dictionary = dictionary;
        this.reader = reader;

        System.out.println("Statements:\n" +
                "  add - adds a word pair to the dictionary\n" +
                "  translate - asks a word and prints its translation\n" +
                "  quit - quits the text user interface\n");
    }

    /**
     * Starts the interface and awaits for user input.
     */
    public void start()
    {
       while (true)
       {
            System.out.print("Statement: ");
            String input = reader.nextLine();

            if (input.equals("quit"))
            {
                System.out.println("Cheers!");
                break;
            }
            else
            {
                handleCommand(input);
            }
        }
    }

    public void handleCommand(String command)
    {
        if (command.equals("add"))
        {
            String word, translation;
            System.out.print("In Finnish: ");
            word = reader.nextLine();
            translation = reader.nextLine();
            dictionary.add(word, translation);
            System.out.println(String.format("Translation: %s", translation));
        }
        else if (command.equals("translate"))
        {
            String word;
            System.out.print("Give a word: ");
            word = reader.nextLine();
            System.out.println(String.format("Translation: %s", dictionary.translate(word)));
        }
        else
        {
            System.out.println("Unknown statement");
        }
    }
}