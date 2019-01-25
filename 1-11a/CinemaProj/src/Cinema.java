
import java.util.*;

public class Cinema {

    public static void main(String[] args) {
        Queue q = new Queue();
        int requiredAge = 15;
        Scanner kybd = new Scanner(System.in);
        String action = "null";
        q.createArray();
        while (!action.equalsIgnoreCase("e")) {
            System.out.println("");
            System.out.print("join(j) leave(l) or end(e): ");
            action = kybd.nextLine();
            System.out.println("");
            if (action.equalsIgnoreCase("j")) {
                System.out.print("Please enter the name, and then the age of the person joining the queue: ");
                String nameInput = kybd.nextLine();
                int ageInput = kybd.nextInt();
                kybd.nextLine();
                q.add(nameInput, ageInput);
                System.out.println(nameInput + " has been added to the queue.");

            } else if (action.equalsIgnoreCase("l")) {
                if (q.isEmpty()) {
                    System.out.println("Invalid! This queue is empty.");
                } else {
                    if (q.isOfAge(requiredAge) == 0) {
                        System.out.println(q.removeFromQ() + " has left the queue and entered the cinema.");
                    } else if (q.isOfAge(requiredAge) == 1) {
                        System.out.println(q.removeFromQ() + " has left the queue but is too young to enter the cinema.");
                    }
                }
            } else if (action.equalsIgnoreCase("e")) {

            } else {
                System.out.println("Invaild Operation!");
            }

        }
        System.out.println("Goodbye!");
    }
}
