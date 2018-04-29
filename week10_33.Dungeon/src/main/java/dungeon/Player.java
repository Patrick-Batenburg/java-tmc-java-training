package dungeon;

import dungeon.Creature;

public class Player implements Creature
{
    private int yPosition;
    private int xPosition;
    private boolean moves;

    public Player()
    {
        this.yPosition = 0;
        this.xPosition = 0;
        this.moves = true;
    }

    public Player(int xPosition, int yPosition)
    {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.moves = true;
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
        return false;
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
        return "@ " + xPosition + " " + yPosition;
    }
}