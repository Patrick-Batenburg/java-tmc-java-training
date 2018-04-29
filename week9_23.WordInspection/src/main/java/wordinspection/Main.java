package wordinspection;

import java.io.File;

public class Main
{
    public static void main(String[] args)
    {
        // test your code here
        File file = new File("src/main/java/com/patrick/shortList.txt");
        WordInspection s = new WordInspection(file);
        System.out.println(s.wordsWhichContainAllVowels());
    }
}