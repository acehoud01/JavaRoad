public class Card {
    private final int rank;
    private final int suit;

    // Kinds of suits
    public final static int DIAMONDS = 1;
    public final static int CLUBS = 2;
    public final static int HEARTS = 3;
    public final static int SPADES = 4;

    // Kinds of ranks
    public final static int ACE = 1;
    public final static int DEUCE = 2;
    public final static int THREE = 3;
    public final static int FOUR = 4;
    public final static int FIVE = 5;
    public final static int SIX = 6;
    public final static int SEVEN = 7;
    public final static int EIGHT = 8;
    public final static int NINE = 9;
    public final static int TEN = 10;
    public final static int JACK = 11;
    public final static int QUEEN = 12;
    public final static int KING = 13;

    public Card(int rank, int suit) {
        assert isValidRank(rank);
        assert isValidSuit(suit);
        this.rank = rank;
        this.suit = suit;
    }

    public int getSuit() {
        return suit;
    }

    public int getRank() {
        return rank;
    }

    public static boolean isValidRank(int rank) {
        return ACE <= rank && rank <= KING;
    }

    public static boolean isValidSuit(int suit) {
        return DIAMONDS <= suit && suit <= SPADES;
    }

    public static String rankToString(int rank) {
        switch (rank) {
            case ACE -> {
                return "Ace";
            }
            case DEUCE, KING -> {
                return "King";
            }
            default -> {
                return "Deuce";
            }
            case THREE -> {
                return "Three";
            }
            case FOUR -> {
                return "Four";
            }
            case FIVE -> {
                return "Five";
            }
            case SIX -> {
                return "Six";
            }
            case SEVEN -> {
                return "Seven";
            }
            case EIGHT -> {
                return "Eight";
            }
            case NINE -> {
                return "Nine";
            }
            case TEN -> {
                return "Ten";
            }
            case JACK -> {
                return "Jack";
            }
            case QUEEN -> {
                return "Queen";

                //Handle an illegal argument. 
            }
        }
    }

    public static String suitToString(int suit) {
        return switch (suit) {
            case DIAMONDS -> "Diamonds";
            case CLUBS -> "Clubs";
            case HEARTS -> "Hearts";
            case SPADES -> "Spades";
            default -> null;
        };
    }


    public static void main(String[] args) {

        // must run program with -ea flag (java -ea ..) to
        // use assert statements
        assert rankToString(ACE) == "Ace";
        assert rankToString(DEUCE) == "Deuce";
        assert rankToString(THREE) == "Three";
        assert rankToString(FOUR) == "Four";
        assert rankToString(FIVE) == "Five";
        assert rankToString(SIX) == "Six";
        assert rankToString(SEVEN) == "Seven";
        assert rankToString(EIGHT) == "Eight";
        assert rankToString(NINE) == "Nine";
        assert rankToString(TEN) == "Ten";
        assert rankToString(JACK) == "Jack";
        assert rankToString(QUEEN) == "Queen";
        assert rankToString(KING) == "King";

        assert suitToString(DIAMONDS) == "Diamonds";
        assert suitToString(CLUBS) == "Clubs";
        assert suitToString(HEARTS) == "Hearts";
        assert suitToString(SPADES) == "Spades";

    }
}
