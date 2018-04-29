package boxes;

import java.util.Collection;

public class BlackHoleBox extends Box
{
    @Override
    public void add(Thing thing)
    {

    }

    @Override
    public void add(Collection<Thing> things)
    {
        super.add(things);
    }

    @Override
    public boolean isInTheBox(Thing thing)
    {
        return false;
    }
}