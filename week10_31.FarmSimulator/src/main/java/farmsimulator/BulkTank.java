package farmsimulator;

public class BulkTank
{
    private double capacity;
    private double volume;

    public BulkTank()
    {
        capacity = 2000;
        volume = 0.0;
    }

    public BulkTank(double capacity)
    {
        this.capacity = capacity;
        volume = 0.0;
    }

    public double howMuchFreeSpace()
    {
        return capacity - volume;
    }

    public void addToTank(double amount)
    {
        if (volume + amount <= capacity)
        {
            volume += amount;
        }
        else
        {
            volume = capacity;
        }
    }

    public double getFromTank(double amount)
    {
        if (volume - amount < 0)
        {
            volume = 0;
            return volume;
        }

        return volume -= amount;
    }

    public double getCapacity()
    {
        return capacity;
    }

    public void setCapacity(double capacity)
    {
        this.capacity = capacity;
    }

    public double getVolume()
    {
        return volume;
    }

    public void setVolume(double volume)
    {
        this.volume = volume;
    }

    @Override
    public String toString()
    {
        return Math.ceil(volume) + "/" + Math.ceil(capacity);
    }
}