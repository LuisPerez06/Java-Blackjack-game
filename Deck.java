import java.util.ArrayList;
public class Deck {
    private int size;
    private ArrayList<Card> deck;
    public Deck(String s){
        size = 52;
        deck = new ArrayList<>();
        String suit="";
        int r1 = 0;
        int r2 = 0;
        for(int i=0;i<52;i++){
            r1 = (int)(Math.random()*4);
            switch(r1){
                case 0:
                    suit = "HEARTS";
                    break;
                case 1:
                    suit = "DIAMONDS";
                    break;
                case 2:
                    suit = "SPADES";
                    break;
                case 3:
                    suit = "CLUBS";
                    break;
            }
            r2 = (int)(Math.random()*13)+1;
            deck.add(new Card(r2,suit));
        }
        size=52;
    }
    public Deck(){
        size = 52;
        deck = new ArrayList<>();
        String suit="";
        for(int i=0;i<4;i++){
            switch(i){
                case 0:
                    suit = "HEARTS";
                    break;
                case 1:
                    suit = "DIAMONDS";
                    break;
                case 2:
                    suit = "SPADES";
                    break;
                case 3:
                    suit = "CLUBS";
                    break;
            }
            for(int j=1;j<14;j++){
                deck.add(new Card(j,suit));
            }
        }
        size=52;
    }
    public Card drawCard(){
        int index = (int) (Math.random()*size);
        size--;
        Card card = deck.get(index);
        deck.remove(index);
        return card;
    }
    public static void displayHand(Card[]hand) {
        for (int i = 0; i < hand.length; i++) {
            if(hand[i]!=null) {
                System.out.print(hand[i].getCard() + ",");
            }
        }
        System.out.println();
    }
}
