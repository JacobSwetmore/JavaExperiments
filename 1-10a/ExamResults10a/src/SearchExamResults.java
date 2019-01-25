
import java.util.*;

public class SearchExamResults {

    public static void main(String[] args) {
        ArrayList<Result> resultsArray;
        resultsArray = new ArrayList<Result>();
//        Result[] resultsArray = new Result[20];

        input(resultsArray);
        sortByMark(resultsArray);
        output(resultsArray);
    }

    public static void input(ArrayList<Result> array) {
        Scanner kybd = new Scanner(System.in);
        for (int i = 0; i < 20; i++) {
            System.out.println("Candidate " + (i + 1));
            System.out.print("\tName: ");
            String name = kybd.nextLine();
            System.out.print("\tMark: ");
            int mark = kybd.nextInt();
            kybd.nextLine();   //to flush the kybd buffer
            
            
            array.add(new Result(name, mark));
                    
//            Result r = new Result();
//            r.setName(name);
//            r.setMark(mark);
//            array.add(r);

//            array[i] = new Result(name, mark);
        }
    }

    public static void sortByMark(ArrayList<Result> array) {
        //selection sort
        for (int pass = 1; pass < array.size(); pass++) {
            int lastElement = array.size() - pass;
            int largePos = findLargestMark(array, array.size() - pass);
            if (largePos != array.size() - pass) {
                Result temp = array.get(largePos);
//                array[largePos] = array[lastElement];
                array.set(largePos, array.get(lastElement));

//                array[lastElement] = temp;
                array.set(lastElement, temp);

            }
            //this is for testing purposes only
            //output(arr); 
        }
    }

    public static int findLargestMark(ArrayList<Result> array, int last) {
        int largestPos = 0;
        for (int i = 1; i <= last; i++) {
            if (array.get(i).getMark() > array.get(largestPos).getMark()) {
                largestPos = i;
            }
        }
        return largestPos;
    }

    public static void output(ArrayList<Result> array) {
        System.out.println("\nExam results");
        System.out.println("============");

        for (int i = 0; i < array.size(); i++) {
            System.out.printf("\t%-20s\t%d\n", array.get(i).getName(), array.get(i).getMark());
        }
    }
}
