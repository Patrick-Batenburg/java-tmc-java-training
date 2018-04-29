public class Airplane
{
    private String id;
    private int capacity;

    /**
     * Initializes a new instance of the Airplane class.
     */
    public Airplane()
    {

    }

    /**
     * Creates a new instance of the Airplane object.
     *
     * @param id        The ID of the Airplane object.
     * @param capacity  The capacity of the Airplane object.
     */
    public Airplane(String id, int capacity)
    {
        this.id = id;
        this.capacity = capacity;
    }

    /**
     * Gets the ID of the Airplane object.
     *
     * @return  The ID of the Airplane object.
     */
    public String GetID()
    {
        return this.id;
    }

    /**
     * Sets the ID of the Airplane object.
     *
     * @param value     The value to set.
     */
    public void setID(String value)
    {
        this.id = value;
    }

    /**
     * Gets the capacity of the Airplane object.
     *
     * @return  The capacity of the Airplane object.
     */
    public int GetCapacity()
    {
        return this.capacity;
    }

    /**
     * Sets the capacity of the Airplane object.
     *
     * @param value     The value to set.
     */
    public void setCapacity(int value)
    {
        this.capacity = value;
    }

    /**
     * Converts the Fields value of this instance to its equivalent string representation, using the specified format.
     *
     * @return  The Fields of the Airplane object.
     */
    public String toString()
    {
        return String.format(this.id + " (%s ppl)", this.capacity);
    }
}