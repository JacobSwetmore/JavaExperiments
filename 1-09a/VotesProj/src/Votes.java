
import java.util.*;

public class Votes {

    public static void main(String[] args) {

        Scanner kybd = new Scanner(System.in);
        String voteInput = "null";

        System.out.println("How many candidates? ");
        int arrayAmount = kybd.nextInt();

        Candidate[] candidates = new Candidate[arrayAmount];

        for (int i = 0; i < arrayAmount; i++) {
            candidates[i] = new Candidate();
            System.out.print("Please enter a candidate name: ");
            candidates[i].setName(kybd.next());
            System.out.println(" ");
        }

        System.out.println("Please enter the name of the candidates you would like to vote for: (Type 'end' to finish) ");

        while (!(voteInput.equals("end"))) {

            voteInput = kybd.nextLine();
            for (int i = 0; i < arrayAmount; i++) {
                if (voteInput.equals(candidates[i].getName())) {
                    candidates[i].incrementVote();
                }
            }

        }

        for (int i = 0; i < arrayAmount; i++) {
            int pointer = candidates[i].getVotes();
            for (int j = 0; j < arrayAmount; j++) {
                int pointer2 = candidates[j].getVotes();
                if (pointer > pointer2) {
                    int temp = candidates[i].getVotes();
                    candidates[i].setVote(candidates[j].getVotes());
                    candidates[j].setVote(temp);
                    String temp2 = candidates[i].getName();
                    candidates[i].setName(candidates[j].getName());
                    candidates[j].setName(temp2);
                }
            }
        }
//
//        for (int i = 1; i < 20; i++) {
//            int value = (candidates[i].getVotes());
//            int j = i - 1;
//
//            while (j >= 0 && candidates[j].getVotes() < value) {
//                candidates[j + 1] = candidates[j];
//                j = j - 1;
//            }
//
//        }
        for (int i = 0; i < arrayAmount; i++) {
            System.out.println(candidates[i].getName() + " got " + candidates[i].getVotes() + " votes.");
        }
    }
}
