import java.util.Scanner;

/**
 * Made by Patrick, 29/08/2017
 */

public class Reader {
    private Scanner reader = new Scanner(System.in);

    /**
     * This method reads the entire line and then turn that in to an string.
     *
     * @return  the line in to an string
     */
    public String readString(){
        String value = reader.nextLine();
        return value;
    }

    /**
     * This method reads the entire line and then turn that in to an integer.
     *
     * @return  the line in to an integer
     */
    public int readInteger(){
        int value = tryParse(reader.nextLine());
        return value;
    }

    /**
     * This method tries to convert a string to an integer.
     *
     * @return  the converted string to an integer value on success, 0 on failure.
     */
    public static Integer tryParse(String text) {
        try {
            return Integer.parseInt(text);
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}
