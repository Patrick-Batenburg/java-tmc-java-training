import java.util.Comparator;

public class SortByPointsDesc implements Comparator<Participant>
{
    public int compare(Participant participant1, Participant participant2)
    {
        if(participant1.getPoints() == participant2.getPoints())
        {
            return 0;
        }
        else if (participant1.getPoints() > participant2.getPoints())
        {
            return -1;
        }
        else
        {
            return 1;
        }
    }
}