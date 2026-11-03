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
ENTER RANDOM FOR RANDOM DECK OR STANDARD FOR STANDARD DECK
Standard
DEALING STANDARD DECK
HOUSE HAND: KING OF SPADES,
Value: 10 + ?
PLAYER HAND: FOUR OF HEARTS,FIVE OF DIAMONDS,
Value: 9
ENTER 1 TO HIT, 2 TO STAND, 3 TO RESTART ROUND
1
PLAYER HAND: FOUR OF HEARTS,FIVE OF DIAMONDS,JACK OF CLUBS,
Value: 19
ENTER 1 TO HIT, 2 TO STAND, 3 TO RESTART ROUND
2
HOUSE HAND: KING OF SPADES,KING OF DIAMONDS,
Value: 20
20>19
YOU LOSE
ENTER 1 TO PLAY AGAIN
4

Process finished with exit code 0
ENTER RANDOM FOR RANDOM DECK OR STANDARD FOR STANDARD DECK
random
DEALING RANDOM DECK
HOUSE HAND: TWO OF CLUBS,
Value: 2 + ?
PLAYER HAND: FIVE OF HEART,SEVEN OF HEART,
Value: 12
ENTER 1 TO HIT, 2 TO STAND, 3 TO RESTART ROUND
1
PLAYER HAND: FIVE OF HEART,SEVEN OF HEART,FIVE OF HEART,
Value: 17
ENTER 1 TO HIT, 2 TO STAND, 3 TO RESTART ROUND
2
HOUSE HAND: TWO OF CLUBS,SEVEN OF HEART,
Value: 9
HOUSE HAND: TWO OF CLUBS,SEVEN OF HEART,QUEEN OF SPADES,
Value: 19
19>17
YOU LOSE
ENTER 1 TO PLAY AGAIN
