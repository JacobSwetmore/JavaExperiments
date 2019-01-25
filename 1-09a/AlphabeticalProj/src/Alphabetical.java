
import java.util.*;

public class Alphabetical {

    public static void main(String[] args) {
        Scanner kybd = new Scanner(System.in);

        System.out.println("How many items in array? ");
        int arrayAmount = kybd.nextInt();

        String[] strings = new String[arrayAmount];
        
        int pass = 1;

        for (int i = 0; i < arrayAmount; i++) {
            System.out.print("Please enter a word: ");
            strings[i] = kybd.next();
            System.out.println(" ");
        }

//        Arrays.sort(strings);
        sort(strings, pass);
        
            

        for (int i = 0; i < arrayAmount; i++) {
                System.out.println(strings[i]);

            }
        }

    

    public static void sort(String[] arr, int pass) {

        if (pass < arr.length) {
            int firstElement = pass - 1;
            int smallPos = findSmallest(arr, firstElement);
            if (smallPos != firstElement) {
                String temp = arr[smallPos];
                arr[smallPos] = arr[firstElement];
                arr[firstElement] = temp;

            }
            pass++;
            sort(arr, pass);

        }
    }

    public static int findSmallest(String[] array, int first) {
        int smallestPos = first;
        for (int i = first + 1; i < array.length; i++) {
            if (array[i].compareTo(array[smallestPos]) < 0) {
                smallestPos = i;
            }
        }
        return smallestPos;
    }
}
