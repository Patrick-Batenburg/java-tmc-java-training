import java.util.*;

public class Participant implements Comparable<Participant>
{
    private String name;
    private int points;
    private List<String> jumpLengths;

    public Participant(String name)
    {
        this.name = name;
        this.points = 0;
        jumpLengths = new ArrayList<String>();
    }

    public void calculatePoints(int jumpLength, List<Judge> votes)
    {
        if (votes.size() != 0)
        {
            jumpLengths.add(String.valueOf((jumpLength)) + " m");
            points += jumpLength;
            Collections.sort(votes);
            votes.remove(votes.size() - 1);
            votes.remove(0);

            for (Judge item : votes)
            {
                points += item.getVote();
            }
        }
    }

    public void printJumpLengths()
    {
        String value = String.valueOf(jumpLengths);
        System.out.println(value.substring(1, value.length() -1));
    }


    @Override
    public int compareTo(Participant o)
    {
        return points - o.getPoints();
    }

    @Override
    public String toString()
    {
        return String.format("%s (%s points)", name, points);
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getPoints()
    {
        return points;
    }

    public void setPoints(int points)
    {
        this.points = points;
    }

    public List<String> getJumpLengths()
    {
        return jumpLengths;
    }

    public void setJumpLengths(List<String> jumpLengths)
    {
        this.jumpLengths = jumpLengths;
    }
}