
import java.util.*;

public class Smallest4 {

    public static void main(String[] args) {

        Scanner kybd = new Scanner(System.in);

        int smallest = 0;
        int input = 0;

        System.out.println("Please enter a number:");
        smallest = kybd.nextInt();

        for (int i = 0; i < 3; i++) {
            System.out.println("Please enter another number:");

            input = kybd.nextInt();

            smallest = smallest(smallest, input);
        }
        
        System.out.println("The smallest number is " + smallest);

    }

    public static int smallest(int smallest, int input) {

        if (smallest > input) {
            smallest = input;
        }

        return smallest;
    }
}
