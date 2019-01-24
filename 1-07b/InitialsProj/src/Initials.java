
import java.util.*;

public class Initials {

    public static void main(String[] args) {

        Scanner kybd = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = kybd.nextLine();

        int space1 = name.indexOf(" ");
        int space2 = name.lastIndexOf(" ");

        char initial1 = name.charAt(0);
        char initial2 = name.charAt(space1 + 1);
        char initial3 = name.charAt(space2 + 1);
       
    System.out.println("Initials: " + initial1 + initial2 + initial3);
    }
}
