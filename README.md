# Java-Blackjack-game
Command-line blackjack game in Java.

## Structure
- Deck class with that initializes deck object contains two methods
- Card class that initializes Card object
- Game class contains main with all game logic

## Features
- Dealer stands on all 17's
- Randomized cards deck option avaliable

## How to run

**Requirements:** Java 17 or newer. Check your version with `java -version`.

1. Clone the repository:
   ```
   git clone https://github.com/your-username/blackjack.git
   cd blackjack/src
   ```
2. Compile the code:
   ```
   javac *.java
   ```
3. Run the game:
   ```
   java Game
   ```

## Sample Output
ENTER RANDOM FOR RANDOM DECK OR STANDARD FOR STANDARD DECK\n
Standard\n
DEALING STANDARD DECK\n
HOUSE HAND: KING OF SPADES,\n
Value: 10 + ?\n
PLAYER HAND: FOUR OF HEARTS,FIVE OF DIAMONDS,\n
Value: 9\n
ENTER 1 TO HIT, 2 TO STAND, 3 TO RESTART ROUND\n
1\n
PLAYER HAND: FOUR OF HEARTS,FIVE OF DIAMONDS,JACK OF CLUBS,\n
Value: 19\n
ENTER 1 TO HIT, 2 TO STAND, 3 TO RESTART ROUND\n
2\n
HOUSE HAND: KING OF SPADES,KING OF DIAMONDS,\n
Value: 20\n
20>19\n
YOU LOSE\n
ENTER 1 TO PLAY AGAIN\n
4\n
Process finished with exit code 0\n

ENTER RANDOM FOR RANDOM DECK OR STANDARD FOR STANDARD DECK\n
random\n
DEALING RANDOM DECK\n
HOUSE HAND: TWO OF CLUBS,\n
Value: 2 + ?\n
PLAYER HAND: FIVE OF HEART,SEVEN OF HEART,\n
Value: 12\n
ENTER 1 TO HIT, 2 TO STAND, 3 TO RESTART ROUND\n
1\n
PLAYER HAND: FIVE OF HEART,SEVEN OF HEART,FIVE OF HEART,\n
Value: 17\n
ENTER 1 TO HIT, 2 TO STAND, 3 TO RESTART ROUND\n
2\n
HOUSE HAND: TWO OF CLUBS,SEVEN OF HEART,\n
Value: 9\n
HOUSE HAND: TWO OF CLUBS,SEVEN OF HEART,QUEEN OF SPADES,\n
Value: 19\n
19>17\n
YOU LOSE\n
ENTER 1 TO PLAY AGAIN\n
