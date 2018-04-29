public class Thing
{
    private String name;
    private int weight;

    /**
     * Initializes a new instance of the Thing class.
     */
    public Thing()
    {
        this.name = "John Doe";
        this.weight = 9001;
    }

    /**
     * Initializes a new instance of the Thing class.
     *
     * @param name      The name of the Thing object.
     * @param weight    The weight of the Thing object.
     */
    public Thing(String name, int weight)
    {
        this.name = name;
        this.weight = weight;
    }

    /**
     * Gets the name of the Thing object.
     *
     * @return  The name of the Thing object.
     */
    public String getName()
    {
        return this.name;
    }

    /**
     * Gets the weight of the Thing object.
     *
     * @return  The weight of the Thing object.
     */
    public int getWeight()
    {
        return this.weight;
    }

    /**
     * Converts the Fields value of this instance to its equivalent string representation, using the specified format.
     *
     * @return  The Fields of the Thing object.
     */
    public String toString()
    {
        return String.format(this.name + " (%s kg)", this.weight);
    }
}