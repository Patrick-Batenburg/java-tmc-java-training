import java.util.ArrayList;
import java.util.Scanner;

public class TextUserInterface
{
    private Scanner reader;
    private Airplane airplane;
    private Flight flight;
    private ArrayList<Airplane> airplanes;
    private ArrayList<Flight> flights;
    private byte interfaceIndex;

    /**
     * Initializes a new instance of the TextUserInterface class.
     */
    public TextUserInterface()
    {
        reader = new Scanner(System.in);
        airplanes = new ArrayList<Airplane>();
        flights = new ArrayList<Flight>();
        interfaceIndex = 0;
    }

    /**
     * Determine which interface to start and awaits for user input.
     */
    public void start()
    {
        switch (interfaceIndex)
        {
            case 0:
                System.out.println("Airport panel\n--------------------\n");

                while (true)
                {
                    System.out.print("Choose operation:\n[1] Add airplane\n[2] Add flight\n[x] Exit\n> ");
                    String input = reader.nextLine();

                    if (input.equals("x"))
                    {
                        interfaceIndex = 1;
                        start();
                        break;
                    }
                    else
                    {
                        handleCommand(input, interfaceIndex);
                    }
                }

                break;
            case 1:
                System.out.println("Flight service\n--------------------\n");

                while (true)
                {
                    System.out.print("Choose operation:\n[1] Print planes\n[2] Print flights\n[3] Print plane info\n[x] Quit\n> ");
                    String input = reader.nextLine();

                    if (input.equals("x"))
                    {
                        break;
                    }
                    else
                    {
                        handleCommand(input, interfaceIndex);
                    }
                }

                break;
            case 3:
                System.exit(3);
                break;
            default:
                interfaceIndex = 3;
                System.out.println("Unknown state");
                break;
        }
    }

    /**
     * Handles which types of commands are supported.
     *
     * @param command   The user input to check for available command.
     * @param index     The value to determine which commands are available for the specified UI.
     */
    public void handleCommand(String command, byte index)
    {
        switch (index)
        {
            case 0:
                if (command.equals("1"))
                {
                    String airplaneID;
                    String capacity = "";

                    System.out.print("Give plane ID: ");
                    airplaneID = reader.nextLine();

                    while (airplaneID.isEmpty())
                    {
                        System.out.print("Given plane ID is invalid. Give plane ID: ");
                        airplaneID = reader.nextLine();
                    }

                    System.out.print("Give plane capacity: ");
                    capacity = reader.nextLine();

                    while (isNumeric(capacity) == false)
                    {
                        System.out.print("Given plane capacity is invalid. Give plane capacity: ");
                        capacity = reader.nextLine();
                    }

                    airplane = new Airplane(airplaneID, Integer.parseInt(capacity));
                    airplanes.add(airplane);
                    airplane = null;

                }
                else if (command.equals("2"))
                {
                    String airplaneID, departureCode, destinationCode;

                    if (airplanes.size() != 0)
                    {
                        System.out.print("Give plane ID: ");
                        airplaneID = reader.nextLine();

                        for(Airplane plane : airplanes)
                        {
                            if(plane.GetID() != null && plane.GetID().contains(airplaneID))
                            {
                                System.out.print("Give departure airport code: ");
                                departureCode = reader.nextLine();
                                System.out.print("Give destination airport code: ");
                                destinationCode = reader.nextLine();
                                flight = new Flight(airplaneID, departureCode, destinationCode);
                                flights.add(flight);
                            }
                            else
                            {
                                System.out.println(String.format("Plane ID: %s doesn't exist.", airplaneID));
                            }
                        }
                    }
                    else 
                    {
                        System.out.println(String.format("There are no planes."));
                    }

                    flight = null;
                }
                else
                {
                    System.out.println("Unknown operation");
                }

                break;
            case 1:
                if (command.equals("1"))
                {
                    if (airplanes.size() != 0)
                    {
                        for(Airplane plane : airplanes)
                        {
                            System.out.print(plane.toString());
                        }
                    }
                    else
                    {
                        System.out.println(String.format("There are no planes."));
                    }
                }
                else if (command.equals("2"))
                {
                    if (airplanes.size() != 0 && flights.size() != 0)
                    {
                        for(Airplane plane : airplanes)
                        {
                            for(Flight planeFlight : flights)
                            {
                                if(plane.GetID().equals(planeFlight.GetAirplaneID()))
                                {
                                    System.out.print( String.format("%s %s", plane.toString(), planeFlight.toString()));
                                }
                            }
                        }
                    }
                    else
                    {
                        System.out.println(String.format("There are no flights."));
                    }
                }
                else if (command.equals("3"))
                {
                    String airplaneID;
                    
                    if (airplanes.size() != 0)
                    {
                        System.out.print("Give plane ID: ");
                        airplaneID = reader.nextLine();

                        for(Airplane plane : airplanes) {
                            if(plane.GetID() != null && plane.GetID().contains(airplaneID))
                            {
                                System.out.print(plane.toString());
                            }
                            else
                            {
                                System.out.println(String.format("Plane ID: %s doesn't exist.", airplaneID));
                            }
                        }
                    }
                    else
                    {
                        System.out.println(String.format("There are no planes."));
                    }
                }
                else
                {
                    System.out.println("Unknown operation");
                }

                break;
            default:
                interfaceIndex = 3;
                System.out.println("Unknown state");
                break;
        }

        System.out.println();
    }

    /**
     * Checks whenever a string is numeric or not.
     *
     * @param input     The value to check.
     * @return          True when the string is numeric, false when it is not.
     */
    boolean isNumeric(String input)
    {
        try
        {
            Integer.parseInt(input);
        }
        catch(NumberFormatException ex)
        {
            return false;
        }

        return true;
    }
}