
import java.util.*;

public class BMI {

    public static void main(String[] args) {
        Scanner kybd = new Scanner(System.in);
        int heightInFeet = 0;
        int remainingInches = 0;
        int heightInInches = 0;
        int weightInStone = 0;
        int remainingPounds = 0;
        int weightInPounds = 0;
        double bodyMassIndex = 0;

        heightInInches = heightInInches(kybd, heightInFeet, remainingInches, heightInInches);
        weightInPounds = weightInPounds(kybd, weightInStone, remainingPounds, weightInPounds);

        bodyMassIndex = outputBMI(heightInInches, weightInPounds, bodyMassIndex);

        System.out.println("You are " + heightInInches + " inches tall");
        System.out.println("You weigh " + weightInPounds + " pounds");
        System.out.printf("Your BMI is %.2f" , bodyMassIndex);

    }

    public static int heightInInches(Scanner kybd, int heightInFeet, int remainingInches, int heightInInches) {
        boolean valid = false;

        do {
            System.out.println("Please enter your height in feet: ");
            heightInFeet = kybd.nextInt();

            if (heightInFeet >= 2 && heightInFeet <= 7) {
                valid = true;
            } else {
                System.out.println("Sorry, that is not a valid input, please try again...");

            }
        } while (valid == false);
        valid = false;
        do {
            System.out.println("Please enter the remaining inches: ");
            remainingInches = kybd.nextInt();

            if (remainingInches >= 0 && remainingInches <= 11) {
                valid = true;
            } else {
                System.out.println("Sorry, that is not a valid input, please try again...");

            }

        } while (valid == false);

        heightInFeet = heightInFeet * 12;
        heightInInches = heightInFeet + remainingInches;
        return heightInInches;

    }

    public static int weightInPounds(Scanner kybd, int weightInStone, int remainingPounds, int weightInPounds) {
        boolean valid = false;

        do {
            System.out.println("Please enter your weight in stone: ");
            weightInStone = kybd.nextInt();

            if (weightInStone >= 3 && weightInStone <= 30) {
                valid = true;
            } else {
                System.out.println("Sorry, that is not a valid input, please try again...");

            }
        } while (valid == false);
        valid = false;
        do {
            System.out.println("Please enter the remaining pounds: ");
            remainingPounds = kybd.nextInt();

            if (remainingPounds >= 0 && remainingPounds <= 13) {
                valid = true;
            } else {
                System.out.println("Sorry, that is not a valid input, please try again...");

            }

        } while (valid == false);

        weightInStone = weightInStone * 14;
        weightInPounds = weightInStone + remainingPounds;
        return weightInPounds;

    }

    public static double outputBMI(int heightInInches, int weightInPounds, double bodyMassIndex) {

        bodyMassIndex = (((double)weightInPounds*703)/(heightInInches * heightInInches));
        return bodyMassIndex;

    }
}
