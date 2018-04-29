import java.util.Scanner;

public class UserInterface
{
    private Scanner reader;
    private PersonDictionary personDictionary;

    public UserInterface()
    {
        reader = new Scanner(System.in);
        personDictionary = new PersonDictionary();
    }

    public void start()
    {
        System.out.println("phone search\n" +
                "available operations:\n" +
                " 1 add a number\n" +
                " 2 search for a number\n" +
                " 3 search for a person by phone number\n" +
                " 4 add an address\n" +
                " 5 search for personal information\n" +
                " 6 delete personal information\n" +
                " 7 filtered listing\n" +
                " x quit\n");

        while (true)
        {
            String input = reader.nextLine();

            if (input.equals("x"))
            {
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
        if (command.equals("1"))
        {
            String name = "";
            String phoneNumber = "";
            System.out.print("whose number: ");
            name = reader.nextLine();
            System.out.println();
            System.out.print("number: ");
            phoneNumber = reader.nextLine();
            System.out.println();
            personDictionary.addPerson(name, phoneNumber);
        }
        else if (command.equals("2"))
        {
            String name = "";
            System.out.print("whose number: ");
            name = reader.nextLine();
            System.out.println();
            System.out.println(personDictionary.getPhoneNumberByName(name));
            System.out.println();
        }
        else if (command.equals("3"))
        {
            String phoneNumber = "";
            System.out.print("number: ");
            phoneNumber = reader.nextLine();
            System.out.print(personDictionary.getNameByPhoneNumber(phoneNumber));
            System.out.println();
        }
        else if (command.equals("4"))
        {
            String name = "";
            String street = "";
            String city = "";
            System.out.print("whose address: ");
            name = reader.nextLine();
            System.out.println();
            System.out.print("street: ");
            street = reader.nextLine();
            System.out.println();
            System.out.print("city: ");
            city = reader.nextLine();
            System.out.println();
            personDictionary.addAddress(name, street, city);
            System.out.println();
        }
        else if (command.equals("5"))
        {
            String name = "";
            System.out.print("whose information: ");
            name = reader.nextLine();
            System.out.println();
            System.out.print(personDictionary.getInfo(name));
        }
        else if (command.equals("6"))
        {
            String name = "";
            System.out.print("whose information: ");
            name = reader.nextLine();
            personDictionary.removeInfo(name);
            System.out.println();
        }
        else if (command.equals("7"))
        {
            System.out.println("keyword (if empty, all listed) : ");
            String keyword = reader.nextLine();
            System.out.println(personDictionary.filteredSearch(keyword));
            System.out.println();
        }
    }
}