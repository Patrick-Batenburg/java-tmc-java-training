package moving.domain;

public class Item implements Thing, Comparable<Item>
{
    private String name;
    private  int volume;

    public Item(String name, int volume)
    {
        this.name = name;
        this.volume = volume;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getVolume()
    {
        return volume;
    }

    public void setVolume(int volume)
    {
        this.volume = volume;
    }

    @Override
    public String toString()
    {
        return String.format("%s (%s dm^3)", name, volume);
    }

    @Override
    public int compareTo(Item o)
    {
        if (this.volume == o.getVolume())
        {
            return 0;
        }
        else if (this.volume > o.getVolume())
        {
            return 1;
        }
        else
        {
            return -1;
        }
    }
}