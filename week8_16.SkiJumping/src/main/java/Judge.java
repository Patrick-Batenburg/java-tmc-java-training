import java.util.Random;

public class Judge implements Comparable<Judge>
{
    private int vote;
    private Random rand;

    public Judge()
    {
        rand = new Random();
        this.vote = rand.nextInt(11) + 10;
    }

    @Override
    public int compareTo(Judge o)
    {
        if(this.vote == o.getVote())
        {
            return 0;
        }
        else if (this.vote > o.getVote())
        {
            return 1;
        }
        else
        {
            return -1;
        }
    }

    public int getVote()
    {
        return this.vote;
    }

    @Override
    public String toString()
    {
        return String.valueOf(vote);
    }
}