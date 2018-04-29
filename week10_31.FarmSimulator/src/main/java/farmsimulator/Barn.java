package farmsimulator;

import java.util.Collection;

public class Barn
{
    private BulkTank tank;
    private MilkingRobot milkingRobot;

    public Barn(BulkTank tank)
    {
        this.tank = tank;
    }

    public void installMilkingRobot(MilkingRobot milkingRobot)
    {
        if (milkingRobot != null)
        {
            this.milkingRobot = milkingRobot;
            this.milkingRobot.setBulkTank(tank);
        }
    }

    public void takeCareOf(Cow cow)
    {
        if (milkingRobot != null)
        {
            if (cow != null)
            {
                milkingRobot.milk(cow);
            }
        }
        else
        {
            throw new IllegalStateException("The MilkingRobot hasn't been installed");
        }
    }

    public void takeCareOf(Collection<Cow> cows)
    {
        if (cows != null)
        {
            for (Cow cow : cows)
            {
                takeCareOf(cow);
            }
        }
    }

    public BulkTank getBulkTank()
    {
        return tank;
    }

    @Override
    public String toString()
    {
        return tank.toString();
    }
}