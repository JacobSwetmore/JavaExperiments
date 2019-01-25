public class Sweets {
    public static void main(String[] args) {
        int sweetsBought = 40;
        int amountOfStudents = 14;
        int sweetsPerChild = sweetsBought/amountOfStudents;
        int teacherSweets = sweetsBought%amountOfStudents;
        
        System.out.println("Each child will recieve " + sweetsPerChild + " sweets.");
        System.out.println("The teacher will take " + teacherSweets + " sweets.");

    }
}
