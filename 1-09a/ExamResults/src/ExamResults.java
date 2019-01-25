
import java.util.*;

public class ExamResults {

    public static void main(String[] args) {
        int pass = 1;
        int[] arr = new int[20];
        input(arr);
        sort(arr, pass);
        output(arr);
    }

    public static void input(int[] arr) {
        Scanner kybd = new Scanner(System.in);
        System.out.println("Enter exam results: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = kybd.nextInt();
        }
    }

    public static void sort(int[] arr, int pass) {

        if (pass < arr.length) {
            int firstElement = pass - 1;
            int smallPos = findSmallest(arr, firstElement);
            if (smallPos != firstElement) {
                int temp = arr[smallPos];
                arr[smallPos] = arr[firstElement];
                arr[firstElement] = temp;

            }
            pass++;
            sort(arr, pass);

        }
    }

    public static int findSmallest(int[] array, int first) {
        int smallestPos = first;
        for (int i = first + 1; i < array.length; i++) {
            if (array[i] < array[smallestPos]) {
                smallestPos = i;
            }
        }
        return smallestPos;
    }

    public static void output(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
    }
}
