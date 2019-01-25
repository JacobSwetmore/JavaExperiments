
import java.util.*;

public class MakeMeBetter {

    public static void main(String[] args) {
        int[] numberArray = new int[11];
        Scanner kybd = new Scanner(System.in);

        System.out.println("Please input " + numberArray.length + " numbers in the range 1-19 :> ");
        for (int i = 0; i < numberArray.length; i++) {

            int input = kybd.nextInt();
            while (input < 1 || input > 19) {
                System.out.println("Not in the range 1-19, please try again :> ");
                input = kybd.nextInt();
            }
            numberArray[i] = input;
        }

        System.out.println("\nArray contents");
        for (int i = 0; i < numberArray.length; i++) {
            System.out.print((numberArray[i] < numberArray.length ? " " : "") + numberArray[i] + "  ");
        }
        System.out.println();

        sort(numberArray);

        System.out.println("\nArray contents");
        for (int i = 0; i < numberArray.length; i++) {
            System.out.print((numberArray[i] < numberArray.length ? " " : "") + numberArray[i] + "  ");
        }
        System.out.println();

        double n = 0;
        for (int i = 0; i < numberArray.length; i++) {
            n = n + numberArray[i];
        }
        System.out.println();
        n = n / numberArray.length;

        System.out.println("The minimum number is: " + numberArray[0]);
        System.out.println("The maximum number is: " + numberArray[numberArray.length - 1]);
        System.out.println("The average value is: " + n);

        System.out.println("The median is: " + medium(numberArray));
    }

    public static double medium(int[] numberArray) {
        double median;
        if (numberArray.length % 2 == 0) {
            median = ((double) numberArray[numberArray.length / 2] + (double) numberArray[numberArray.length / 2 - 1]) / 2;
        } else {
            median = (double) numberArray[numberArray.length / 2];
        }
        return median;
    }

    public static void sort(int[] numberArray) {
        boolean noSwap = false;
        int startAt = 0;
        int stopAt = numberArray.length - 1;
        while (startAt < stopAt && noSwap == false) {
            noSwap = true;
            for (int i = startAt; i < stopAt; i++) {
                if (numberArray[i] > numberArray[i + 1]) {
                    int t = numberArray[i];
                    numberArray[i] = numberArray[i + 1];
                    numberArray[i + 1] = t;
                    noSwap = false;
                }
            }
            stopAt = stopAt - 1;
        }
    }
}
