package dungeon;

public interface Creature
{
    void move(int x, int y);
    boolean isMovable();
    int getXPosition();
    int getYPosition();
    void setXPosition(int xPosition);
    void setYPosition(int yPosition);
}