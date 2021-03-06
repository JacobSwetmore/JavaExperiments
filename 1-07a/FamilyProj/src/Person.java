
public class Person {
    //private variables – hidden data

    private String firstName;
    private String lastName;
    private int day;
    private int month;
    private int year;
    private int height;

    //public methods
    public void setName(String forename, String surname) {
        firstName = forename;
        lastName = surname;
    }

    public void setSurname(String surname) {
        lastName = surname;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public void setDOB(int d, int m, int y) {
        if (dateValid(d, m, y)) {
            day = d;
            month = m;
            year = y;
        }
    }

    public String getDOB() {
        return day + "-" + month + "-" + year;
    }

    public int getAgeAt(int d, int m, int y) {
        int age = -1;

        if (dateValid(d, m, y) && dateAfterDoB(d, m, y)) {
            age = y - year;
            if (m < month || (m == month && d < day)) {
                age--;
            }
        }
        return age;
    }

    public int setHeight(int inches) {
        height = inches;
        return height;
    }

    public String getHeight() {
        int feet = 0;
        int inches = 0;
        feet = height / 12;
        inches = height % 12;

        return feet + " feet " + inches + " inches ";
    }

    private boolean dateValid(int d, int m, int y) {
        return (d >= 1 && d <= 31) && (m >= 1 && m <= 12);

    }

    private boolean dateAfterDoB(int d, int m, int y) {
        return (y > year)
                || (y == year && m > month)
                || (y == year && m == month && d > day);
    }

}
