
import java.util.*;

public class SmallestInArray {

    public static void main(String[] args) {
        int[] inputNumbers = new int[10];
        Scanner kybd = new Scanner(System.in);

        System.out.println("Please input 10 numbers: ");

        for (int i = 0; i < 10; i++) {
            inputNumbers[i] = kybd.nextInt();
        }

        System.out.println("Here are your numbers in order:");

        int smallest = inputNumbers[0];

        for (int i = 1; i < 10; i++) {
            if (inputNumbers[i] < smallest) {
                smallest = inputNumbers[i];
            }
        }

        System.out.println("Smallest Number is : " + smallest);
    }

}
