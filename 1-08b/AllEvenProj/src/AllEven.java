
import java.util.*;

public class AllEven {

    public static void main(String[] args) {
        int[] integers;
        int[] evenIntegers;
        int amountEven = 0;
        Scanner kybd = new Scanner(System.in);

        System.out.println("How many items in the array? ");
        int integerAmount = kybd.nextInt();

        integers = new int[integerAmount];

        amountEven = read(integerAmount, integers, amountEven);

        evenIntegers = new int[amountEven];

        getEven(integerAmount, integers, evenIntegers);
        
        print(amountEven, evenIntegers);
    }

    public static int read(int integerAmount, int[] integers, int amountEven) {

        Scanner kybd = new Scanner(System.in);
        for (int i = 0; i < integerAmount; i++) {
            System.out.print("Please enter a number:");
            integers[i] = kybd.nextInt();
            if (integers[i] % 2 == 0) {
                amountEven = amountEven + 1;
            }
        }
        return amountEven;
    }

    public static void getEven(int integerAmount, int[] integers, int[] evenIntegers) {
        int index = 0;
        for (int i = 0; i < integerAmount; i++) {
            if (integers[i] % 2 == 0) {
                evenIntegers[index++] = integers[i];
            }
        }

    }

    public static void print(int amountEven, int[] evenIntegers) {
        for (int i = 0; i < amountEven; i++) {
            System.out.println(evenIntegers[i]);
        }
    }
}
