
import java.util.*;

public class Reverse {

    public static void main(String[] args) {
        int[] inputNumbers = new int[10];
        Scanner kybd = new Scanner(System.in);
        
        System.out.println("Please input 10 numbers: ");

        for (int i = 0; i < 10; i++)
        {
            inputNumbers[i] = kybd.nextInt();
        }
        
        System.out.println("Here are your numbers in reverse:");
        
        for (int i = 10 - 1; i > -1; i--)
        {
            System.out.println(inputNumbers[i]);
        }
    }

}
