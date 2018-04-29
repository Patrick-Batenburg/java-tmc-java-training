import java.util.ArrayList;

public class Suitcase
{
    private ArrayList<Thing> things = new ArrayList<Thing>();
    private int maximumWeight;
    private int currentWeight;

    /**
     * Initializes a new instance of the Suitcase class.
     */
    public Suitcase()
    {
        maximumWeight = 5;
    }

    /**
     * Initializes a new instance of the Suitcase class.
     */
    public Suitcase(int maximumWeight)
    {
        this.maximumWeight = maximumWeight;
    }

    /**
     * Adds a new Thing object to the Suitcase object.
     *
     * @param thing Thing object to add to the Suitcase object.
     */
    public void addThing(Thing thing)
    {
        if (currentWeight + thing.getWeight() <= maximumWeight)
        {
            things.add(thing);
            currentWeight += thing.getWeight();
        }
    }

    /**
     * Converts the Fields value of this instance to its equivalent string representation, using the specified format.
     *
     * @return  The amount of Thing objects in the Suitcase object.
     */
    public String toString()
    {
        String msg;

        switch (things.size())
        {
            case 0:
                msg = "empty (0 kg)";
                break;
            case 1:
                msg = String.format(things.size() + " thing (%s kg)", this.currentWeight);
                break;
            default:
                msg = String.format(things.size() + " things (%s kg)", this.currentWeight);
                break;
        }

        return msg;
    }

    /**
     * Prints all the Thing objects in the Suitcase object.
     */
    public void printThings()
    {
        for (Thing item : things)
        {
            System.out.println(String.format("%s (%s kg)", item.getName(), item.getWeight()));
        }
    }

    /**
     * Count the weight of all the Thing objects in the Suitcase object.
     *
     * @return The total weight of all Thing objects in the Suitcase object.
     */
    public int totalWeight()
    {
        int totalWeight = 0;

        for (Thing item : things)
        {
            totalWeight += item.getWeight();
        }

        return totalWeight;
    }

    /**
     * Searches the Suitcase object for the heaviest Thing object.
     *
     * @return The heaviest Thing object in the Suitcase object.
     */
    public Thing heaviestThing()
    {
        int heaviestObject = 0;
        Thing result = null;

        for (Thing item : things)
        {
            if (item.getWeight() > heaviestObject)
            {
                heaviestObject = item.getWeight();
                result = item;
            }
        }

        return result;
    }

    /**
     * Gets the weight of the Suitcase object.
     *
     * @return  The weight of the Suitcase object.
     */
    public int getWeight()
    {
        return this.currentWeight;
    }
}