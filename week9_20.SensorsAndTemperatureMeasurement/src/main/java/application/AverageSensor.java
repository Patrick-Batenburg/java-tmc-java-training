package application;

import java.util.*;

public class AverageSensor implements Sensor
{
    private List<Sensor> sensors;
    private List<Integer> readings;

    public AverageSensor()
    {
        sensors = new ArrayList<Sensor>();
        readings = new ArrayList<Integer>();
    }

    public void addSensor(Sensor additional)
    {
        if (additional != null)
        {
            sensors.add(additional);
        }
    }

    public List<Integer> readings()
    {
        return readings;
    }

    @Override
    public boolean isOn()
    {
        for (Sensor item : sensors)
        {
            if (!item.isOn())
            {
                return false;
            }
        }

        return true;
    }

    @Override
    public void on()
    {
        for (Sensor item : sensors)
        {
            item.on();
        }
    }

    @Override
    public void off()
    {
        for (Sensor item : sensors)
        {
            item.off();
        }
    }

    @Override
    public int measure()
    {
        int total = 0;

        if (sensors.size() != 0)
        {
            for (Sensor item : sensors)
            {
                total += item.measure();
            }

            total = total / sensors.size();
            readings.add(total);
        }

        return total;
    }
}