
public class Card {

    public static void main(String[] args) {
        int player1Card;
        int player2Card;
        int cardsDealt = 0;
        int player1Points = 0;
        int player2Points = 0;

        while (cardsDealt < 14) {
            player1Card = ((int) ((Math.random() * 13) + 1));

            if (player1Card == 1) {
                System.out.println("Player 1 was dealt an Ace");
            } else if (player1Card >= 2 && player1Card <= 10) {
                System.out.println("Player 1 was dealt " + player1Card);
            } else if (player1Card == 11) {
                System.out.println("Player 1 was dealt a Jack");
            } else if (player1Card == 12) {
                System.out.println("Player 1 was dealt a Queen");
            } else if (player1Card == 13) {
                System.out.println("Player 1 was dealt a King");
            }
            player2Card = ((int) ((Math.random() * 13) + 1));

            if (player2Card == 1) {
                System.out.println("Player 2 was dealt an Ace");
            } else if (player2Card >= 2 && player2Card <= 10) {
                System.out.println("Player 2 was dealt " + player2Card);
            } else if (player2Card == 11) {
                System.out.println("Player 2 was dealt a Jack");
            } else if (player2Card == 12) {
                System.out.println("Player 2 was dealt a Queen");
            } else if (player2Card == 13) {
                System.out.println("Player 2 was dealt a King");
            }
            if (player1Card > player2Card) {
                System.out.println("Player 1 wins this round");
                player1Points++;
            }
            if (player1Card < player2Card) {
                System.out.println("Player 2 wins this round");
                player2Points++;
            } else if (player1Card == player2Card) {
                System.out.println("This round is a draw");
            }

            System.out.println("-----------------------");

            cardsDealt += 2;
        }
        if (player1Points > player2Points) {
            System.out.println("Player 1 Wins with " + player1Points + " points, compared to Player 2's " + player2Points + " points");
        } else if (player1Points < player2Points) {
            System.out.println("Player 2 Wins with " + player2Points + " points, compared to Player 1's " + player1Points + " points");
        } else if (player1Points == player2Points) {
            System.out.println("Player 1 and Player 2 both have " + player1Points + " points, therefore it is a draw.");
        }
    }
}
