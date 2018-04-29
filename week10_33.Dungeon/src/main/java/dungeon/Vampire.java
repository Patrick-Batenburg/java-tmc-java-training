package dungeon;

public class Vampire implements Creature
{
    private int yPosition;
    private int xPosition;
    private boolean moves;

    public Vampire(boolean moves)
    {
        this.moves = moves;
    }

    public Vampire(int xPosition, int yPosition, boolean moves)
    {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.moves = moves;
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

        Vampire vampire = (Vampire) o;

        if (xPosition != vampire.getXPosition())
        {
            return false;
        }

        return yPosition == vampire.getYPosition();
    }

    @Override
    public int hashCode()
    {
        int result = yPosition;
        result = 31 * result + xPosition;
        return result;
    }

    @Override
    public void move(int x, int y)
    {
        if (moves)
        {
            xPosition += x;
            yPosition += y;
        }
    }

    @Override
    public boolean isMovable()
    {
        return moves;
    }

    @Override
    public int getXPosition()
    {
        return xPosition;
    }

    @Override
    public void setXPosition(int xPosition)
    {
        this.xPosition = xPosition;
    }

    @Override
    public int getYPosition()
    {
        return yPosition;
    }

    @Override
    public void setYPosition(int yPosition)
    {
        this.yPosition = yPosition;
    }

    @Override
    public String toString()
    {
        return "v " + xPosition + " " + yPosition;
    }
}