
import java.util.*;

public class Factorial {

    public static void main(String[] args) {

        Scanner kybd = new Scanner(System.in);

        System.out.println("Please input a positive number above 1");
        int input = kybd.nextInt();
        
        int factorial = factorial( input);
        
        System.out.println("The factorial of " + input + " is " + factorial);
    }

    public static int factorial(int input) {
        int i;
        int factorial = 1;
        
        for (i = 1; i <= input; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }
}
