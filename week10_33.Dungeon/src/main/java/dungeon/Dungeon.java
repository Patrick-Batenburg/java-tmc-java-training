package dungeon;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Dungeon
{
    private Scanner reader;
    private Map map;
    private int amountOfVampires;
    private int moves;
    private boolean isMovable;
    private Random random;
    private Player player;
    private List<Vampire> vampires;

    public Dungeon(int length, int height, int amountOfVampires, int moves, boolean isMovable)
    {
        this.reader = new Scanner(System.in);
        this.map = new Map(length, height);
        this.amountOfVampires = amountOfVampires;
        this.moves = moves;
        this.isMovable = isMovable;
        this.random = new Random();
        this.player = new Player();
        this.vampires = new ArrayList<Vampire>();
        generateVampires();
    }

    private void generateVampires()
    {
        for (int i = 0; i <= this.amountOfVampires - this.vampires.size(); i++)
        {
            Vampire vampire = new Vampire(this.random.nextInt(this.map.getLength()), this.random.nextInt(this.map.getHeight()), this.isMovable);

            if (!this.vampires.contains(vampire))
            {
                this.vampires.add(vampire);
            }
        }

        if (this.vampires.size() != this.amountOfVampires)
        {
            generateVampires();
        }
    }

    public void run()
    {
        while (moves > 0)
        {
            if (this.vampires.size() == 0)
            {
                break;
            }

            System.out.println(this.moves);
            System.out.println();
            pirntCreatures();
            System.out.println();
            printMap();
            System.out.println();

            String input = this.reader.nextLine();
            handleCommand(input);
            moveCreatures();
            this.moves--;
        }

        if(this.vampires.size() == 0)
        {
            System.out.println("YOU WIN");
        }
        else
        {
            System.out.println("YOU LOSE");
        }
    }

    public void moveCreatures()
    {
        for (Creature creature : vampires)
        {
            int x = this.random.nextInt(this.map.getLength());
            int y = this.random.nextInt(this.map.getHeight());
            Vampire vampire = new Vampire(x, y, true);

            if (!this.vampires.contains(vampire) && x != this.player.getXPosition() && y != this.player.getYPosition())
            {
                creature.move(x, y);
            }
        }
    }

    public void handleCommand(String command)
    {
        int x = 0;
        int y = 0;

        for (Character item : command.toCharArray())
        {
            if (Character.toLowerCase(item) == 'w')
            {
                y--;
            }

            if (Character.toLowerCase(item) == 'a')
            {
                x--;
            }

            if (Character.toLowerCase(item) == 's')
            {
                y++;
            }

            if (Character.toLowerCase(item) == 'd')
            {
                x++;
            }
        }

        if (!isCreatureOutOfBounds(this.player, x, y))
        {
            this.player.move(x, y);
            
            Vampire vampire = new Vampire(this.player.getXPosition(), this.player.getYPosition(), true);

            if (this.vampires.contains(vampire))
            {
                this.vampires.remove(vampire);
            }
        }
        else
        {
            movePlayer(x, y);

            Vampire vampire = new Vampire(this.player.getXPosition(), this.player.getYPosition(), true);

            if (this.vampires.contains(vampire))
            {
                this.vampires.remove(vampire);
            }
        }
    }

    public void printMap()
    {
        System.out.println(map.toString(this.player, this.vampires));
    }

    private void pirntCreatures()
    {
        System.out.println(this.player.toString());

        for (Creature creature : this.vampires)
        {
            System.out.println(creature.toString());
        }
    }

    public void movePlayer(int x, int y)
    {
        if (this.player.getXPosition() + x > this.map.getLength() - 1)
        {
            this.player.setXPosition(this.map.getLength() - 1);
        }

        if (this.player.getXPosition() + x < 0)
        {
            this.player.setXPosition(0);
        }

        if (this.player.getYPosition() + y > this.map.getHeight() - 1)
        {
            this.player.setYPosition(this.map.getHeight() - 1);
        }

        if (this.player.getYPosition() + x < 0)
        {
            this.player.setYPosition(0);
        }
    }

    public boolean isCreatureOutOfBounds(Creature creature, int x, int y)
    {
       return creature.getXPosition() + x > this.map.getLength() - 1 || creature.getXPosition() + x < 0 || creature.getYPosition() + y > this.map.getHeight() - 1 || creature.getYPosition() + y < 0;
    }
}