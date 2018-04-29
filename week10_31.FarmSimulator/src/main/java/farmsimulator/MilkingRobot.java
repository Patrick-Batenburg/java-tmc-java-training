package farmsimulator;

public class MilkingRobot
{
    private BulkTank tank;

    public MilkingRobot()
    {

    }

    public BulkTank getBulkTank()
    {
        return tank;
    }

    public void setBulkTank(BulkTank tank)
    {
        if (tank != null)
        {
            this.tank = tank;
        }
    }

    public void milk(Milkable milkable)
    {
        if (tank != null)
        {
            if (milkable != null)
            {
                tank.addToTank(milkable.milk());
            }
        }
        else
        {
            throw new IllegalStateException("The MilkingRobot hasn't been installed");
        }
    }
}