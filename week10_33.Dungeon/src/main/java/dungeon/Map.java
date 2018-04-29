package dungeon;

import java.util.List;

public class Map
{
    private int length;
    private int height;

    public Map(int length, int height)
    {
        this.length = length;
        this.height = height;
    }

    public int getLength()
    {
        return length;
    }

    public void setLength(int length)
    {
        this.length = length;
    }

    public int getHeight()
    {
        return height;
    }

    public void setHeight(int height)
    {
        this.height = height;
    }

    @Override
    public String toString()
    {
        StringBuilder result = new StringBuilder();

        for (int row = 0; row < height; row++)
        {
            for (int index = 0; index < length; index++)
            {
                result.append(".");
            }

            result.append("\n");
        }

        return result.toString();
    }

    public String toString(Creature player, List<Vampire> monsters)
    {
        StringBuilder result = new StringBuilder();

        for (int row = 0; row < height; row++)
        {
            for (int index = 0; index < length; index++)
            {
                Vampire vampire = new Vampire(index, row, true);

                if (player.getXPosition() == index && player.getYPosition() == row)
                {
                    result.append("@");
                }
                else if  (monsters.contains(vampire))
                {
                    result.append("v");
                }
                else
                {
                    result.append(".");
                }
                //result.append(".");
            }

            result.append("\n");
        }

        return result.toString();
    }
}