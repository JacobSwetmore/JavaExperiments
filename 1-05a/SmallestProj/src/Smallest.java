
import java.util.*;

public class Smallest {

    public static void main(String[] args) {
        Scanner kybd = new Scanner(System.in);

        System.out.println("Please enter 10 numbers: ");
        int num = kybd.nextInt();
        
        int smallest = num;
        int position = 1;
        
        for(int i = 2; i<=10; i++)
        {
            num = kybd.nextInt();
            if (num < smallest)
            {
                smallest = num;
                position = i;
            }
       }
        System.out.println("Smallest value found at " + position);

    }

}
