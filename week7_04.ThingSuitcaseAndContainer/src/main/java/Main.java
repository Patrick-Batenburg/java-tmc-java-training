public class Main
{
    public static void main(String[] Container)
    {
        Container container = new Container(100);
        addSuitcasesFullOfBricks(container);
        System.out.println(container);
    }

    public static void addSuitcasesFullOfBricks(Container container)
    {
        for (int i = 0; i < container.getMaxWeight(); i++)
        {
            Thing brick = new Thing("Brick", i + 1);
            Suitcase suitcase = new Suitcase(100);
            suitcase.addThing(brick);
            container.addSuitcase(suitcase);
        }
    }
}