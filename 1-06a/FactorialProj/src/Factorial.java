
import java.util.*;

public class Factorial {

    public static void main(String[] args) {

        Scanner kybd = new Scanner(System.in);

        System.out.println("Please input a positive number above 1");
        int input = kybd.nextInt();

        System.out.println("The factorial of " + input + " is " + factorial(input));
    }

    public static int factorial(int input) {
        if (input != 1) {
            return input * factorial(input - 1);
        }
        else
            return 1;
    }
}
