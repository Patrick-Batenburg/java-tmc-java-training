import java.util.*;

public class UserInterface
{
    private Scanner reader;
    private List<Participant> participants;
    private List<Judge> judges;
    private int roundCount;
    private Random rand;

    /**
     * Initializes a new instance of the UserInterface class.
     */
    public UserInterface()
    {
        reader = new Scanner(System.in);
        participants = new ArrayList<Participant>();
        judges = new ArrayList<Judge>();
        rand = new Random();
        roundCount = 1;


    }

    public void revote()
    {
        judges.clear();

        for (int i = 0; i < 5; i++)
        {
            judges.add(new Judge());
        }
    }

    public void start()
    {
        System.out.println("Kumpula ski jumping week\n\nWrite the names of the participants one at a time; an empty string brings you to the jumping phase.");

        while (true)
        {
            System.out.print("  Participant name: ");
            String input = reader.nextLine();

            if (input.equals(""))
            {
                startJump();
                break;
            }
            else
            {
                participants.add(new Participant(input));
            }
        }
    }

    public void startJump()
    {
        System.out.println("\nThe tournament begins!");

        while (true)
        {
            System.out.print("\nWrite \"jump\" to jump; otherwise you quit: ");
            String input = reader.nextLine();

            if (input.equals("jump"))
            {
                startRound();
            }
            else
            {
                showResults();
                break;
            }
        }
    }

    public void startRound()
    {
        System.out.println("Round " + roundCount + "\nJumping order:\n");

        Collections.sort(participants);

        for (int i = 0; i < participants.size(); i++)
        {
            System.out.println(String.format("  %s. %s", (i + 1), participants.get(i).toString()));
        }

        System.out.println("\nResults of round " + roundCount);

        for (int i = 0; i < participants.size(); i++)
        {
            int jumpLength = rand.nextInt(61) + 60;
            revote();
            System.out.println( String.format("  %s\n    length: %s\n    judge votes: %s", participants.get(i).getName(), jumpLength, judges.toString()));
            participants.get(i).calculatePoints(jumpLength, judges);
        }

        roundCount++;
    }

    public void showResults()
    {
        Collections.sort(participants, new SortByPointsDesc());

        System.out.println("\n\nThanks!\n\nTournament results:\nPosition    Name");
        for (int i = 0; i < participants.size(); i++)
        {
            System.out.println((i + 1) + "           " + participants.get(i).toString());
            System.out.print("            jump lengths: ");
            participants.get(i).printJumpLengths();
        }
    }
}