
import java.util.*;

public class InfiniteInitials {

    public static void main(String[] args) {

        {
            System.out.println("Please enter your name: ");

            Scanner kybd = new Scanner(System.in);
            String name = kybd.nextLine();

            String[] names = name.split(" +");
            for (int i = 0; i < names.length; i++) {
                if (names[i].indexOf("-") < 1) {
                    System.out.print(names[i].charAt(0) + ".");

                } else if (names[i].indexOf("-") > 0) {

                    int dashPosition = names[i].indexOf("-");

                    System.out.print(names[i].charAt(0) + "-");

                    System.out.print(names[i].charAt(dashPosition + 1));

                    System.out.print(".");

                }

            }
        }
    }
}
