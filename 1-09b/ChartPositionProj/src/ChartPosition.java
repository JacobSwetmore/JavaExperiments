
import java.util.*;

public class ChartPosition {

    public static void main(String[] args) {

        String item = "null";

        Scanner kybd = new Scanner(System.in);

        String[] artists = {"Clean Bandit", "James Arthur", "Little Mix", "Rae Sremmurd", "Weekend",
            "Neiked", "Bruno Mars", "Maroon", "Chainsmokers", "Hailee Steinfeld"};

        while (!item.equals("end")) {

            System.out.println("Please enter artists names to see their position in the charts. Type 'end' to exit: ");
            item = kybd.nextLine();

            if (item.equals("end")) {
                System.out.println("Goodbye");
            } else {

                if (getPositionInCharts(artists, item) == -1) {
                    System.out.println("Sorry, either the artist is not present, or that is an invalid input.");
                } else {

                    System.out.println("That artist is at position " + getPositionInCharts(artists, item));
                }
            }
        }
    }

    public static int getPositionInCharts(String[] artists, String item) {

        int positionInCharts = 0;
        while (positionInCharts < artists.length && !artists[positionInCharts].equals(item)) {
            positionInCharts++;
        }

        if (positionInCharts == artists.length) {
            return -1;
        }

        return positionInCharts + 1;
    }
}
