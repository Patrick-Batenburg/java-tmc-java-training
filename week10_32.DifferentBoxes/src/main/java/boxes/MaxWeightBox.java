package boxes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MaxWeightBox extends Box
{
    private int capacity;
    private List<Thing> things;

    public MaxWeightBox(int capacity)
    {
        this.capacity = capacity;
        things = new ArrayList<Thing>();
    }

    @Override
    public void add(Thing thing)
    {
        if (!exceeds(thing))
        {
            things.add(thing);
        }
    }

    @Override
    public void add(Collection<Thing> things)
    {
        if (things != null)
        {
            for (Thing thing : things)
            {
                add(thing);
            }
        }
    }

    public boolean exceeds(Thing thing)
    {
        int volume = 0;

        for (Thing item : things)
        {
            volume += item.getWeight();
        }

        if (volume + thing.getWeight() > capacity)
        {
            return true;
        }

        return false;
    }

    @Override
    public boolean isInTheBox(Thing thing)
    {
        for (Thing item : things)
        {
            if (item.equals(thing))
            {
                return true;
            }
        }

        return false;
    }
}