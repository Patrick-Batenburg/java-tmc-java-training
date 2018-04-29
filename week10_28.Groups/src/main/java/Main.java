import movable.Group;
import movable.Organism;

public class Main
{
    public static void main(String[] args)
    {
        Group group = new Group();
        group.addToGroup(new Organism(5,10));
        group.move(1,0);
        group.toString();
    }
}