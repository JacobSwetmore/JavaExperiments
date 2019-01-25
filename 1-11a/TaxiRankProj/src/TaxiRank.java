
import java.util.*;

public class TaxiRank {

    public static void main(String[] args) {
        Rank q = new Rank();

        Scanner kybd = new Scanner(System.in);
        System.out.print("Join (j), leave (l) or end (e)? ");
        String action = kybd.nextLine();
        while (!action.equalsIgnoreCase("e")) {
            if (action.equalsIgnoreCase("j")) {
                System.out.print("Please Enter Taxi Registration Number: ");
                String registration = kybd.nextLine();
                q.add(registration);
                System.out.println("Taxi with registration " + registration + " joined queue");
            } else if (action.equalsIgnoreCase("l")) {
                if (!q.isEmpty()) {
                    System.out.println("Taxi with registration " + q.remove() + " left queue");
                } else {
                    System.out.println("Taxi rank empty");
                }
            } else {
                System.out.println("Invalid operation");
            }
            System.out.print("Join (j), leave (l) or end (e)? ");
            action = kybd.nextLine();
        }
    }
}
