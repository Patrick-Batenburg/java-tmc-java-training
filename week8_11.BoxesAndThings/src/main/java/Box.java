import java.util.ArrayList;

public class Box implements ToBeStored
{
    private double maximumWeight;
    private ArrayList<ToBeStored> objects;

    public Box()
    {
        objects = new ArrayList<ToBeStored>();
    }

    public Box(double maximumWeight)
    {
        this.maximumWeight = maximumWeight;
        objects = new ArrayList<ToBeStored>();
    }

    /**
     * Adds a new ToBeStored object to the Box object.
     *
     * @param t  ToBeStored object to add to the Box object.
     */
    public void add(ToBeStored t)
    {
        if (t != null)
        {
            if (weight() + t.weight() < maximumWeight)
            {
                objects.add(t);
            }
        }
    }

    @Override
    public double weight()
    {
        double weight = 0;

        if (objects.size() != 0)
        {
            for (ToBeStored item : objects)
            {
                weight += item.weight();
            }
        }

        return weight;
    }

    @Override
    public String toString()
    {
        int amountItems = objects.size();


        return String.format("Box: %s things, total weight %s kg", amountItems, weight());
    }
}