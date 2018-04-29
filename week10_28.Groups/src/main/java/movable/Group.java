package movable;

import java.util.ArrayList;
import java.util.List;

public class Group implements Movable
{
    private List<Movable> objects;

    public Group()
    {
        objects = new ArrayList<Movable>();
    }

    public void addToGroup(Movable movable)
    {
        this.objects.add(movable);
    }

    @Override
    public void move(int dx, int dy)
    {
        if (objects != null)
        {
            for (Movable object : objects)
            {
                object.move(dx, dy);
            }
        }
    }

    @Override
    public String toString()
    {
        String result = "";

        if (objects != null)
        {
            for (Movable object : objects)
            {
                result += object.toString() + "\n";
            }
        }

        return result;
    }
}