import java.util.HashMap;

public class PromissoryNote
{
    private HashMap<String, Double> table;

    /**
     * Initializes a new instance of the PromissoryNote class.
     */
    public PromissoryNote()
    {
        this.table = new HashMap<String, Double>();
    }

    /**
     * Sets the information about the loan.

     * @param toWhom    The name of the person.
     * @param value     The value about the loans.
     */
    public void setLoan(String toWhom, double value)
    {
        this.table.put(toWhom, value);
    }

    /**
     * Gets the debt held by the person.

     * @param whose     debt held by the person.
     * @return          The entity of the debt held by the person.
     */
    public double howMuchIsTheDebt(String whose)
    {
        double result = 0d;

        if(this.table.containsKey(whose))
        {
            result = this.table.get(whose);
        }

        return result;
    }
}