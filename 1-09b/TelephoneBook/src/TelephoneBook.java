
import java.util.*;

public class TelephoneBook {

    public static void main(String[] args) {
        Scanner kybd = new Scanner(System.in);
        Entry[] dir = new Entry[4];
        int position;

        inputDirectory(dir);
        System.out.print("Enter number to search for (enter '0' to finish): ");
        int number = kybd.nextInt();
        while (number != 0) {

            position = searchDirectory(dir, number);
            if (position == -1) {
                System.out.println("Number not in directory");
            } else {
                System.out.println("Name for " + number + " is " + dir[position].getName());
            }
            System.out.print("Enter number to search for (enter '0' to finish): ");
            number = kybd.nextInt();

        }
    }

    public static void inputDirectory(Entry[] dir) {
        Scanner kybd = new Scanner(System.in);
        for (int i = 0; i < dir.length; i++) {
            dir[i] = new Entry();
            System.out.print("Name for entry " + (i + 1) + ": ");
            dir[i].setName(kybd.next());
            System.out.print("Number for entry " + (i + 1) + ": ");
            dir[i].setNumber(kybd.nextInt());
        }
    }

    public static void outputDirectory(Entry[] dir) {
        for (int i = 0; i < dir.length; i++) {
            System.out.print((i + 1) + ":\tName " + dir[i].getName());
            System.out.println("\t" + dir[i].getNumber());
        }
    }

    public static int searchDirectory(Entry[] arr, int item) {

        int index = 0;
        while (index < arr.length && arr[index].getNumber() != item) {
            index++;
        }
        if (index == arr.length) {
            //item not found    
            index = -1;    }
        return index;

    }
}
