public class Card {
    private int Value;
    private String suit;
    public Card(int num, String suit){
        switch(num){
            case 1:
                suit = "ACE OF " + suit;
                break;
            case 2:
                suit = "TWO OF " + suit;
                break;
            case 3:
                suit = "THREE OF " + suit;
                break;
            case 4:
                suit = "FOUR OF " + suit;
                break;
            case 5:
                suit = "FIVE OF " + suit;
                break;
            case 6:
                suit = "SIX OF " + suit;
                break;
            case 7:
                suit = "SEVEN OF " + suit;
                break;
            case 8:
                suit = "EIGHT OF " + suit;
                break;
            case 9:
                suit = "NINE OF " + suit;
                break;
            case 10:
                suit = "TEN OF " + suit;
                break;
            case 11:
                suit = "JACK OF " + suit;
                num = 10;
                break;
            case 12:
                suit = "QUEEN OF " + suit;
                num = 10;
                break;
            case 13:
                suit = "KING OF " + suit;
                num = 10;
                break;
        }
        this.suit = suit;
        this.Value=num;
    }
    public String getCard(){
        return suit;
    }
    public int getValue(){
        return Value;
    }
}
