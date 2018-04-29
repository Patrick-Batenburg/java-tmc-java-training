package boxes;

public class Main
{
    public static void main(String[] args)
    {
        Box box = new MaxWeightBox(5);
        box.add(new Thing("a", 1));
        box.add(new Thing("b", 2));
        box.add(new Thing("c", 2));
        box.add(new Thing("d", 1));
        box.add(new Thing("f", 0));
        box.isInTheBox(new Thing("d"));
    }
}