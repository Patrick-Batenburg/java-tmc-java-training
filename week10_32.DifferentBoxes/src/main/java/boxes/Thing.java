package boxes;

public class Thing
{
    private String name;
    private int weight;

    public Thing(String name, int weight)
    {
        this.name = name;

        if (weight > -1)
        {
            this.weight = weight;
        }
        else
        {
            throw new IllegalArgumentException("");
        }
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

        Thing thing = (Thing) o;

        return name != null ? name.equals(thing.name) : thing.name == null;
    }

    @Override
    public int hashCode()
    {
        int result = name != null ? name.hashCode() : 0;
        return result;
    }

    public Thing(String name)
    {
        this(name, 0);
    }

    public String getName()
    {
        return name;
    }

    public int getWeight()
    {
        return weight;
    }
}