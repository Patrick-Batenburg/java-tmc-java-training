package farmsimulator;

import java.util.Random;

public class Cow implements Milkable, Alive
{
    private String name;
    private double capacity;
    private double milkAmount;
    private Random random;
    private static final String[] NAMES = new String[]
    {
        "Anu", "Arpa", "Essi", "Heluna", "Hely",
        "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",
        "Jaana", "Jami", "Jatta", "Laku", "Liekki",
        "Mainikki", "Mella", "Mimmi", "Naatti",
        "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
        "Rima", "Soma", "Sylkki", "Valpu", "Virpi"
    };

    public Cow()
    {
        random = new Random();
        name = NAMES[random.nextInt(NAMES.length - 1) - 0];
        capacity = random.nextInt((40 - 15) + 1) + 15;
        milkAmount = 0.0;
    }

    public Cow(String name)
    {
        this.name = name;
        random = new Random();
        capacity = random.nextInt((40 - 15) + 1) + 15;
        milkAmount = 0.0;
    }

    public double getCapacity()
    {
        return capacity;
    }

    public double getAmount()
    {
        return milkAmount;
    }

    public String getName()
    {
        return name;
    }

    @Override
    public void liveHour()
    {
        milkAmount += 0.7 + (2.0 - 0.7) * random.nextDouble();

        if (milkAmount > capacity)
        {
            milkAmount = capacity;
        }
    }

    @Override
    public double milk()
    {
        double milkTake = milkAmount;
        milkAmount = 0;
        return milkTake;
    }

    @Override
    public String toString()
    {
        return name + " " + Math.ceil(milkAmount) + "/" + Math.ceil(capacity);
    }
}