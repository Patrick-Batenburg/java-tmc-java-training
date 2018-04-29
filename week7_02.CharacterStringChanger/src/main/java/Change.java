public class Change
{
    private char fromCharacter, toCharacter;

    public Change(char fromCharacter, char toCharacter)
    {
        this.fromCharacter = fromCharacter;
        this.toCharacter = toCharacter;
    }

    public String change(String characterString)
    {
        String  result = "";

        for ( int i=0; i < characterString.length(); i++)
        {
            if (characterString.charAt(i) == fromCharacter)
            {
                result += toCharacter;
            }
            else
            {
                result += characterString.charAt(i);
            }
        }

        return result;
    }
}