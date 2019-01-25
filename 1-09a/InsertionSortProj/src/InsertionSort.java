
import java.util.*;

public class InsertionSort {

    public static void main(String[] args) {
        Scanner kybd = new Scanner(System.in);
        int value;
        int j;

        int[] integers = new int[20];

        for (int i = 0; i < 20; i++) {
            System.out.print("Please enter an integer: ");
            integers[i] = kybd.nextInt();
        }

        for (int i = 1; i < 20; i++) {
            value = integers[i];
            j = i - 1;

            while (j >= 0 && integers[j] < value) {
                integers[j + 1] = integers[j];
                j = j - 1;
            }
            integers[j + 1] = value;
        }

        for (int i = 0; i < 20; i++) {
            System.out.println(integers[i]);
        }

    }
}
