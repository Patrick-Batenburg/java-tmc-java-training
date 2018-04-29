package application;

import java.util.Random;

public class Thermometer implements Sensor
{
    private Random random;
    private boolean isOn = false;

    public Thermometer()
    {
        random = new Random();
    }

    @Override
    public boolean isOn()
    {
        return isOn;
    }

    @Override
    public void on()
    {
        isOn = true;
    }

    @Override
    public void off()
    {
        isOn = false;
    }

    @Override
    public int measure()
    {
        isOn = true;
        return random.nextInt(60) - 30;
    }
}