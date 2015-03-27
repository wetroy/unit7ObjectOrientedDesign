/**
 * This is a class that tests the Card class.
 */
public class CardTester {

    /**
     * The main method in this class checks the Card operations for consistency.
     *	@param args is not used.
     */
    public static void main(String[] args) {
        Card c1 = new Card("jack","blue",  11);
        Card c2 = new Card("king","red",  13);
        Card c3 = new Card("queen","yellow",  12);
        System.out.println("it should be jack, king, queen");
        c1.rank();
        c2.rank();
        c3.rank();
        System.out.println("it should be blue, red, yellow");
        c1.suit();
        c2.suit();
        c3.suit();
        System.out.println("it should be 11, 13, 12");
        c1.pointValue();
        c2.pointValue();
        c3.pointValue();
    }
}
