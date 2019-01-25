
import java.util.*;

public class DifferentBrackets {

    public static void main(String[] args) {
        Stack brackets = new Stack();
        Stack squareBrackets = new Stack();
        Stack squiggleBrackets = new Stack();
        boolean incorrect = false;

        Scanner kybd = new Scanner(System.in);
        System.out.println("Please enter brackets on a new line: (end with *)");
        String action = kybd.next();
        while (!action.equalsIgnoreCase("*")) {
            if (action.equalsIgnoreCase("(")) {
                int empNumber = 1;
                brackets.push(empNumber);
                action = kybd.next();
            } else if (action.equalsIgnoreCase("{")) {
                int empNumber = 1;
                squiggleBrackets.push(empNumber);
                action = kybd.next();
            } else if (action.equalsIgnoreCase("[")) {
                int empNumber = 1;
                squareBrackets.push(empNumber);
                action = kybd.next();
            } else if (action.equalsIgnoreCase(")")) {
                if (brackets.isEmpty()) {
                    System.out.println("Brackets are not well formed.");
                    action = "*";
                    incorrect = true;
                } else {
                    brackets.pop();

                    action = kybd.next();
                }
            } else if (action.equalsIgnoreCase("}")) {
                if (squiggleBrackets.isEmpty()) {
                    System.out.println("Brackets are not well formed.");
                    action = "*";
                    incorrect = true;
                } else {
                    squiggleBrackets.pop();

                    action = kybd.next();
                }
            } else if (action.equalsIgnoreCase("]")) {
                if (squareBrackets.isEmpty()) {
                    System.out.println("Brackets are not well formed.");
                    action = "*";
                    incorrect = true;
                } else {
                    squareBrackets.pop();

                    action = kybd.next();
                }
            } else {
                System.out.println("Invalid operation");
                action = kybd.next();
            }

        }
        if (brackets.isEmpty() && squiggleBrackets.isEmpty() && squareBrackets.isEmpty() && !incorrect) {
            System.out.println("Well formed brackets!");
        } else if ( !incorrect) {
            System.out.println("Brackets are not well formed!");
        }
    }
}

//!brackets.isEmpty() && squiggleBrackets.isEmpty() && squareBrackets.isEmpty() &&