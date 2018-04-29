public class Main
{
    public static void main(String[] args)
    {
        Hand hand = new Hand();
        hand.add(new Card(12, Card.HEARTS));
        hand.add(new Card(2, Card.CLUBS));
        hand.add(new Card(2, Card.SPADES));
        hand.add(new Card(14, Card.CLUBS));
        hand.sort();
        hand.print();

        /*
        Hand hand = new Hand();
        hand.add(new Card(12,Card.HEARTS));
        hand.add(new Card(14,Card.DIAMONDS));
        hand.add(new Card(2,Card.SPADES));
        hand.add(new Card(2,Card.CLUBS));
        hand.sort();
        hand.print();

        first should be printed 2 of Spades
        print output was
        2 of Clubs
        2 of Spades
        Q of Hearts
        A of Diamonds*/
    }
}