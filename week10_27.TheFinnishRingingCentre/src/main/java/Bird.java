public class Bird
{
    private String name;
    private String latinName;
    private int ringingYear;

    public Bird(String name, String latinName, int ringingYear)
    {
        this.name = name;
        this.latinName = latinName;
        this.ringingYear = ringingYear;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getLatinName()
    {
        return latinName;
    }

    public void setLatinName(String latinName)
    {
        this.latinName = latinName;
    }

    public int getRingingYear()
    {
        return ringingYear;
    }

    public void setRingingYear(int ringingYear)
    {
        this.ringingYear = ringingYear;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o)
        {
            return true;
        }

        if (o == null || getClass() != o.getClass())
        {
            return false;
        }

        Bird bird = (Bird) o;

        if (ringingYear != bird.ringingYear)
        {
            return false;
        }

        return latinName.equals(bird.latinName);
    }

    @Override
    public int hashCode()
    {
        int result = 31;
        result = 31 * result + latinName.hashCode();
        result = 31 * result + ringingYear;
        return result;
    }

    @Override
    public String toString()
    {
        return this.latinName + " (" + this.ringingYear + ")";
    }
}