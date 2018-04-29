package farmsimulator;

import java.util.ArrayList;
import java.util.List;

public class Farm implements Alive
{
    private String owner;
    private Barn barn;
    private List<Cow> cows;

    public Farm(String owner, Barn barn)
    {
        this.owner = owner;
        this.barn = barn;
        cows = new ArrayList<Cow>();
    }

    public void addCow(Cow cow)
    {
        if (cow != null)
        {
            cows.add(cow);
        }
    }

    public void installMilkingRobot(MilkingRobot milkingRobot)
    {
        if (milkingRobot != null)
        {
            barn.installMilkingRobot(milkingRobot);
        }
    }

    public void manageCows()
    {
        for (Cow cow : cows)
        {
            barn.takeCareOf(cow);
        }
    }

    @Override
    public void liveHour()
    {
        for (Cow cow : cows)
        {
            cow.liveHour();
        }
    }

    @Override
    public String toString()
    {
        return "Farm{" +
                "owner='" + owner + '\'' +
                ", barn=" + barn +
                '}';
    }

    public String getOwner()
    {
        return owner;
    }

    public void setOwner(String owner)
    {
        this.owner = owner;
    }

    public Barn getBarn()
    {
        return barn;
    }

    public void setBarn(Barn barn)
    {
        this.barn = barn;
    }
}