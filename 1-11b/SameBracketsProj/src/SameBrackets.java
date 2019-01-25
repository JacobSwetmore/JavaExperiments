
import java.util.*;

public class SameBrackets {

    public static void main(String[] args) {
        Stack brackets = new Stack();
        boolean incorrect = false;

        Scanner kybd = new Scanner(System.in);
        System.out.println("Please enter brackets on a new line: (end with *)");
        String action = kybd.next();
        while (!action.equalsIgnoreCase("*")) {
            if (action.equalsIgnoreCase("(")) {
                int empNumber = 1;
                brackets.push(empNumber);
                action = kybd.next();
            } else if (action.equalsIgnoreCase(")")) {
                if (brackets.isEmpty()) {
                    System.out.println("Closing bracket with no matching opening bracket");
                    action = "*";
                    incorrect = true;
                } else {
                    brackets.pop();

                    action = kybd.next();
                }
            } else {
                System.out.println("Invalid operation");
                action = kybd.next();
            }

        }
        if (brackets.isEmpty() && !incorrect){ 
            System.out.println("Well formed brackets!");
        }
        else if (!brackets.isEmpty() && !incorrect)
        {
            System.out.println("Opening bracket with no matching closing bracket");
        }
    }
}
