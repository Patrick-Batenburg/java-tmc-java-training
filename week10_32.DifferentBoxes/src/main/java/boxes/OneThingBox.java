package boxes;

import java.util.Collection;

public class OneThingBox extends Box
{
    private Thing item;

    public OneThingBox()
    {
        item = null;
    }

    @Override
    public void add(Thing thing)
    {
        if (item == null)
        {
            if (thing != null)
            {
                item = thing;
            }
        }
    }

    @Override
    public void add(Collection<Thing> things)
    {
        if (item == null)
        {
            if (things != null)
            {
                item = things.iterator().next();
            }
        }
    }

    @Override
    public boolean isInTheBox(Thing thing)
    {
        if (item != null)
        {
            if (thing != null)
            {
                if (item.equals(thing))
                {
                    return true;
                }
            }
        }

        return false;
    }
}