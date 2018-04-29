public class Smileys
{
    public static void main(String[] args)
    {
        // Test your method at least with the following
        printWithSmileys("Method");
        printWithSmileys("Beerbottle");
        printWithSmileys("Interface");
    }

    private static void printWithSmileys(String characterString)
    {
        String smileyRow = "";
        String middleRow = "";
        int charAmount = 0;

        if (characterString.length() % 2 == 1)
        {
            middleRow = ":) " + characterString + "  :)";
            charAmount = middleRow.length();

            for (int i = 0; i < charAmount / 2; i++)
            {
                smileyRow += ":)";
            }

            System.out.println(smileyRow);
            System.out.println(middleRow);
            System.out.println(smileyRow);
        }
        else
        {
            middleRow = ":) " + characterString + " :)";
            charAmount = middleRow.length();

            for (int i = 0; i < charAmount / 2; i++)
            {
                smileyRow += ":)";
            }

            System.out.println(smileyRow);
            System.out.println(middleRow);
            System.out.println(smileyRow);
        }
    }
}
