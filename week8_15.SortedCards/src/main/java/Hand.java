import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hand implements Comparable<Hand>
{
    private List<Card> cards;

    public Hand()
    {
        this.cards = new ArrayList<Card>();
    }

    public void  add(Card card)
    {
        cards.add(card);
    }

    public void print()
    {
        if (cards.size() != 0)
        {
            for (Card item : cards)
            {
                System.out.println(item.toString());
            }
        }
    }

    @Override
    public int compareTo(Hand o)
    {
        int comparedHandValue = 0;
        int handValue = 0;

        if (cards.size() != 0)
        {
            if (o.getHand().size() != 0)
            {
                for (Card item : cards)
                {
                    handValue += item.getValue();
                }

                for (Card item : o.getHand())
                {
                    comparedHandValue += item.getValue();
                }
            }
        }

        return handValue - comparedHandValue;
    }

    public void sort()
    {
        if (cards.size() != 0)
        {
            Collections.sort(cards, new SortAgainstSuitAndValue());
        }
    }


    public void sortAgainstSuit()
    {
        if (cards.size() != 0)
        {
            Collections.sort(cards, new SortAgainstSuit());
        }
    }

    public List<Card> getHand()
    {
        return cards;
    }
}