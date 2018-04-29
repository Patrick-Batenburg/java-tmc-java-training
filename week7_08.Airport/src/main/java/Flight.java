public class Flight
{
    private String airplaneID;
    private String departureCode;
    private String destinationCode;

    /**
     * Initializes a new instance of the Flight class.
     */
    public Flight()
    {

    }

    /**
     * Creates a new instance of the Flight object.
     *
     * @param airplaneID        The airplane ID of the Flight object.
     * @param departureCode     The departure code of the Flight object.
     * @param destinationCode   The destination code of the Flight object.
     */
    public Flight(String airplaneID, String departureCode, String destinationCode)
    {
        this.airplaneID = airplaneID;
        this.departureCode = departureCode;
        this.destinationCode = destinationCode;
    }

    /**
     * Gets the airplane ID of the Flight object.
     *
     * @return  The airplane ID of the Flight object.
     */
    public String GetAirplaneID()
    {
        return this.airplaneID;
    }

    /**
     * Sets the airplane ID of the Flight object.
     *
     * @param value     The value to set.
     */
    public void setAirplaneID(String value)
    {
        this.airplaneID = value;
    }

    /**
     * Gets the departure code of the Flight object.
     *
     * @return  The departure code of the Flight object.
     */
    public String GetDepartureCode()
    {
        return this.departureCode;
    }

    /**
     * Sets the departure code of the Flight object.
     *
     * @param value     The value to set.
     */
    public void setDepartureCode(String value)
    {
        this.departureCode = value;
    }

    /**
     * Gets the destination code of the Flight object.
     *
     * @return  The destination code of the Flight object.
     */
    public String GetDestinationCode()
    {
        return this.destinationCode;
    }

    /**
     * Sets the destination code of the Flight object.
     *
     * @param value     The value to set.
     */
    public void setDestinationCode(String value)
    {
        this.destinationCode = value;
    }

    /**
     * Converts the Fields value of this instance to its equivalent string representation, using the specified format.
     *
     * @return  The Fields of the Flight object.
     */
    public String toString()
    {
        return String.format("(%s-%s)", this.departureCode, this.destinationCode);
    }
}