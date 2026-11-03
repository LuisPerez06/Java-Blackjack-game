import java.util.InputMismatchException;
import java.util.Scanner;
public class Game {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice2 = 1;
        String choice3 = "";
        System.out.println("ENTER RANDOM FOR RANDOM DECK OR STANDARD FOR STANDARD DECK");
        choice3=input.next();
        Deck deck;
        if(choice3.equalsIgnoreCase("standard")){
            System.out.println("DEALING STANDARD DECK");
            deck = new Deck();
        }
        else if(choice3.equalsIgnoreCase("random")){
            System.out.println("DEALING RANDOM DECK");
            deck = new Deck("");
        }
        else{
            System.out.println("INPUT DOES NOT MATCH EITHER CASE,DEALING STANDARD DECK");
            deck = new Deck();
        }
        while (choice2 == 1) {
            Card[] playerHand = new Card[22];
            Card[] houseHand = new Card[22];
            int houseHandPoint = 0;
            int playerHandPoint = 0;
            int choice = 0;
            houseHand[houseHandPoint] = deck.drawCard();
            System.out.print("HOUSE HAND: ");
            deck.displayHand(houseHand);
            System.out.printf("Value: %d + ?\n",sumOfHand(houseHand));
            houseHandPoint++;
            houseHand[houseHandPoint] = deck.drawCard();
            houseHandPoint++;
            playerHand[playerHandPoint] = deck.drawCard();
            playerHandPoint++;
            playerHand[playerHandPoint] = deck.drawCard();
            playerHandPoint++;
            System.out.print("PLAYER HAND: ");
            deck.displayHand(playerHand);
            System.out.println("Value: " + sumOfHand(playerHand));
            while (choice != 3) {
                if(sumOfHand(playerHand)==21){
                    System.out.println("YOU WIN");
                    break;
                }
                System.out.println("ENTER 1 TO HIT, 2 TO STAND, 3 TO RESTART ROUND");
                try{
                    choice = input.nextInt();
                }catch(InputMismatchException e){
                    System.out.println("INPUT NOT INT,TRY AGAIN");
                    choice=0;
                    input.next();
                }
                if (choice == 3) break;
                if (choice == 1) {
                    playerHand[playerHandPoint] = deck.drawCard();
                    playerHandPoint++;
                    deck.displayHand(playerHand);
                    System.out.println("Value: " + sumOfHand(playerHand));
                    if (sumOfHand(playerHand) > 21) {
                        System.out.println("YOU LOSE");
                        break;
                    }
                } else if(choice==2) {
                    System.out.print("HOUSE HAND: ");
                    deck.displayHand(houseHand);
                    System.out.printf("Value: %d\n",sumOfHand(houseHand));
                    while (true) {
                        if (sumOfHand(houseHand) >= 17) {
                            if (sumOfHand(houseHand) > 21) {
                                //System.out.print("HOUSE HAND: ");
                                //deck.displayHand(houseHand);
                                System.out.printf("%d>%d\n", sumOfHand(houseHand), 21);
                                System.out.println("YOU WIN");
                                break;
                            }
                            if (sumOfHand(houseHand) > sumOfHand(playerHand)) {
                                //System.out.print("HOUSE HAND: ");
                                //deck.displayHand(houseHand);
                                System.out.printf("%d>%d\n", sumOfHand(houseHand), sumOfHand(playerHand));
                                System.out.println("YOU LOSE");
                                break;
                            }
                            if (sumOfHand(houseHand) == sumOfHand(playerHand)) {
                                //System.out.print("HOUSE HAND: ");
                                //deck.displayHand(houseHand);
                                System.out.printf("%d==%d\n", sumOfHand(houseHand), sumOfHand(playerHand));
                                System.out.println("YOU TIE");
                                break;
                            }
                            if (sumOfHand(houseHand) < sumOfHand(playerHand)) {
                                //System.out.print("HOUSE HAND: ");
                                //deck.displayHand(houseHand);
                                System.out.printf("%d<%d\n", sumOfHand(houseHand), sumOfHand(playerHand));
                                System.out.println("YOU WIN");
                                break;
                            }
                        } else {
                            houseHand[houseHandPoint] = deck.drawCard();
                            houseHandPoint++;
                            System.out.print("HOUSE HAND: ");
                            deck.displayHand(houseHand);
                            System.out.printf("Value: %d\n",sumOfHand(houseHand));
                        }
                    }
                    break;
                }
            }
            System.out.println("ENTER 1 TO PLAY AGAIN");
            try{
                choice2 = input.nextInt();
            }catch(InputMismatchException e){
                System.out.println("INPUT NOT INT, EXITING");
                choice2=0;
                input.next();
            }
            if(choice3.equalsIgnoreCase("standard")){
                //System.out.println("DEALING STANDARD DECK");
                deck = new Deck();
            }
            else if(choice3.equalsIgnoreCase("random")){
                //System.out.println("DEALING RANDOM DECK");
                deck = new Deck("");
            }
            else{
                //System.out.println("INPUT DOES NOT MATCH EITHER CASE,DEALING STANDARD DECK");
                deck = new Deck();
            }
        }
    }
    public static int sumOfHand(Card[] hand){
        int sum1 = 0;
        int sum2 = 0;
        for(int i=0;i<hand.length;i++){
            if(hand[i]!=null){
                sum1 += hand[i].getValue();
            }
        }
        for(int i=0;i<hand.length;i++){
            if(hand[i]!=null){
                if (hand[i].getCard().contains("ACE")&&!(sum2+11>21)) {
                    sum2 += 11;
                }
                else {
                    sum2 += hand[i].getValue();
                }
            }
        }
        if(sum2>sum1&&!(sum2>21)){
            return sum2;
        }else return sum1;
    }
}
