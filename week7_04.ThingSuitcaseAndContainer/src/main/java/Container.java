import java.util.ArrayList;

public class Container
{
    private ArrayList<Suitcase> suitcases = new ArrayList<Suitcase>();
    private int maximumWeight;
    private int currentWeight;

    /**
     * Initializes a new instance of the Container class.
     */
    public Container()
    {
        maximumWeight = 5;
    }

    /**
     * Initializes a new instance of the Container class.
     */
    public Container(int maximumWeight)
    {
        this.maximumWeight = maximumWeight;
    }

    /**
     * Adds a new Suitcase object to the Container object.
     *
     * @param suitcase Suitcase object to add to the Container object.
     */
    public void addSuitcase(Suitcase suitcase)
    {
        if (currentWeight + suitcase.getWeight() <= maximumWeight)
        {
            suitcases.add(suitcase);
            currentWeight += suitcase.getWeight();
        }
    }

    /**
     * Prints all the Thing objects in the Suitcase object.
     */
    public void printThings()
    {
        for (Suitcase suitcase : suitcases)
        {
            suitcase.printThings();
        }
    }

    /**
     * Converts the Fields value of this instance to its equivalent string representation, using the specified format.
     *
     * @return  The amount of Suitcase objects in the Container object.
     */
    public String toString()
    {
        return String.format(suitcases.size() + " suitcases (%s kg)", this.currentWeight);
    }

    /**
     * Gets the maximum weight of the Suitcase object.
     *
     * @return  The maximum weight of the Suitcase object.
     */
    public int getMaxWeight()
    {
        return this.maximumWeight;
    }
}