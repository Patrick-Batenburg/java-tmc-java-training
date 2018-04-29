package moving.domain;

import java.util.ArrayList;
import java.util.List;

public class Box implements Thing
{
    private int maximumCapacity;
    private List<Thing> things;

    public Box(int maximumCapacity)
    {
        this.maximumCapacity = maximumCapacity;
        things = new ArrayList<Thing>();
    }

    public boolean addThing(Thing thing)
    {
        if (this.getVolume() + thing.getVolume() <= maximumCapacity)
        {
            things.add(thing);
            return true;
        }

        return false;
    }

    @Override
    public int getVolume()
    {
        int volume = 0;

        for (Thing item : things)
        {
            volume += item.getVolume();
        }

        return volume;
    }
}