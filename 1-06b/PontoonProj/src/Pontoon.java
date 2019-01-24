
import java.util.*;

public class Pontoon {

    public static void main(String args[]) {

        Scanner kybd = new Scanner(System.in);

        //deal initial hands
        int playerScore = 0;
        int computerScore = 0;
        int score = 0;
        int temp = 0;
        String moreCards;
        //deal card to player and increment playerScore
        playerScore = dealCard(score);
        if (playerScore == 1) {
            System.out.println("You were dealt an Ace");
        } else if (playerScore >= 2 && playerScore <= 10) {
            System.out.println("You were dealt " + playerScore);
        } else if (playerScore == 11) {
            System.out.println("You were dealt a Jack");
        } else if (playerScore == 12) {
            System.out.println("You were dealt a Queen");
        } else if (playerScore == 13) {
            System.out.println("You were dealt a King");
        }
        //deal card to computer and increment computerScore
        computerScore = dealCard(score);
        //deal card to player and increment playerScore
        temp = dealCard(score);
        playerScore = playerScore + temp;
        if (temp == 1) {
            System.out.println("You were dealt an Ace");
        } else if (temp >= 2 && temp <= 10) {
            System.out.println("You were dealt " + temp);
        } else if (temp == 11) {
            System.out.println("You were dealt a Jack");
        } else if (temp == 12) {
            System.out.println("You were dealt a Queen");
        } else if (temp == 13) {
            System.out.println("You were dealt a King");
        }
        //deal card to computer and increment computerScore
        computerScore = computerScore + dealCard(score);
        //deal additional cards to player
        System.out.println("do you want more cards? (yes/no)");
        moreCards = kybd.next();
        while (moreCards.equals("yes")) {
                    temp = dealCard(score);
        playerScore = playerScore + temp;
        if (temp == 1) {
            System.out.println("You were dealt an Ace");
        } else if (temp >= 2 && temp <= 10) {
            System.out.println("You were dealt " + temp);
        } else if (temp == 11) {
            System.out.println("You were dealt a Jack");
        } else if (temp == 12) {
            System.out.println("You were dealt a Queen");
        } else if (temp == 13) {
            System.out.println("You were dealt a King");
        }
            System.out.println("do you want more cards? (yes/no)");
            moreCards = kybd.next();

        }
        //deal additional cards to computer
        while (computerScore < 15) {
            computerScore = computerScore + dealCard(score);
        }
        //check for winner
        checkWin(playerScore, computerScore);
    }

    public static int dealCard(int score) {

        int playerCard = ((int) ((Math.random() * 13) + 1));

        if (playerCard == 1) {
            score = 11;
        } else if (playerCard >= 2 && playerCard <= 10) {
            score = playerCard;
        } else if (playerCard == 11) {
            score = playerCard;
        } else if (playerCard == 12) {
            score = playerCard;
        } else if (playerCard == 13) {
            score = playerCard;
        }

        return score;

    }

    public static void checkWin(int playerScore, int computerScore) {
        if (playerScore > 21) {
            System.out.println("player bust");
        } else if (computerScore > 21) {
            System.out.println("computer bust");
        } else {
            if (playerScore > computerScore) {
                System.out.println("player wins");
            } else {
                System.out.println("computer wins");
            }
        }
    }
}
