
import java.util.*;

public class InsertionSort {

    public static void main(String[] args) {
        Scanner kybd = new Scanner(System.in);

        int i = 1;

        int[] integers = new int[20];

        for (int k = 0; k < 20; k++) {
            System.out.print("Please enter an integer: ");
            integers[k] = kybd.nextInt();
        }
        
        Sort(i, integers);

        for (int k = 0; k < 20; k++) {
            System.out.println(integers[k]);
        }

    }

    public static void Sort(int i, int integers[]) {

        int value;
        int j;

//        for (i = 1; i < 20; i++) {
        if (i < 20) {

            value = integers[i];
            j = i - 1;

            while (j >= 0 && integers[j] < value) {
                integers[j + 1] = integers[j];
                j = j - 1;
            }
            integers[j + 1] = value;

            i++;
            Sort(i, integers);
        }
    }
}
