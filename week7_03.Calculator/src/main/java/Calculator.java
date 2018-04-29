/**
 * Made by Patrick, 29/08/2017
 */

public class Calculator {
    private Reader reader = new Reader();
    private int calculations = 0;

    /**
     * Default constructor.
     */
    public Calculator() {
    }

    /**
     * This method awaits for user inputs and invokes the operation the user typed.
     */
    public void start() {
        while (true) {
            System.out.print("command: ");
            String command = reader.readString();

            if (command.equals("end")) {
                break;
            } else {
                handleCommand(command);
            }
        }
        statistics();
    }

    public void handleCommand(String command) {
        if (command.equals("sum")) {
            sum();
        } else if (command.equals("difference")) {
            difference();
        } else if (command.equals("product")) {
            product();
        }
    }

    /**
     * This method prints the amount of operations done with the calculator.
     */
    private void statistics() {
        System.out.println("Calculations done " + calculations);
    }

    /**
     * This method awaits for user input and calculates the sum of 2 values.
     */
    private void sum() {
        System.out.print("value1: ");
        int value1 = reader.readInteger(); // read the value using the Reader-object
        System.out.print("value2: ");
        int value2 = reader.readInteger(); // read the value using the Reader-object
        System.out.println("Sum of the values " + (value1 + value2));
        System.out.println();

        calculations++;
    }

    /**
     * This method awaits for user input and calculates the difference of 2 values.
     */
    private void difference() {
        System.out.print("value1: ");
        int value1 = reader.readInteger(); // read the value using the Reader-object
        System.out.print("value2: ");
        int value2 = reader.readInteger(); // read the value using the Reader-object
        System.out.println("Difference of the values " + (value1 - value2));
        System.out.println();
        calculations++;
    }

    /**
     * This method awaits for user input and calculates the product of 2 values.
     */
    private void product() {
        System.out.print("value1: ");
        int value1 = reader.readInteger(); // read the value using the Reader-object
        System.out.print("value2: ");
        int value2 = reader.readInteger(); // read the value using the Reader-object
        System.out.println("Product of the values " + (value1 * value2));
        System.out.println();
        calculations++;
    }
}
