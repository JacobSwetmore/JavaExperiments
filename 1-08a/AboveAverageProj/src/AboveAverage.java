
import java.util.*;

public class AboveAverage {

    public static void main(String[] args) {
        String[] studentNames;
        int[] studentMarks;
        int total = 0;
        Scanner kybd = new Scanner(System.in);

        System.out.println("How many students are there? ");
        int amountOfStudents = kybd.nextInt();

        studentNames = new String[amountOfStudents];
        studentMarks = new int[amountOfStudents];
        if (amountOfStudents < 1) {
            System.out.println("Sorry, that is not a valid amount of students.");
        } else {
            for (int i = 0; i < amountOfStudents; i++) {
                System.out.print("Student Name: ");
                studentNames[i] = kybd.next();
                System.out.println(" ");
                System.out.print("Student Mark: ");
                studentMarks[i] = kybd.nextInt();

                System.out.println(" ");
                total = total + studentMarks[i];
            }

            double average = total / amountOfStudents;

            System.out.println("The average mark is " + average);

            System.out.println(average);

            for (int i = 0; i < amountOfStudents; i++) {
                if (studentMarks[i] > average) {

                    System.out.println(studentNames[i] + " is above the average mark, with a score of " + studentMarks[i]);

                }
            }
        }
    }

}
