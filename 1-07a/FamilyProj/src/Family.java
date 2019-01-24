
public class Family {

    public static void main(String[] args) {

        Person mum = new Person();
        Person dad = new Person();
        Person son = new Person();
        Person daughter = new Person();

        Person[] family = new Person[4];

        mum.setName("Juliet", "Capulet");
        mum.setDOB(7, 11, 1987);
        mum.setHeight(68);

        family[0] = mum;

        dad.setName("Romeo", "Montague");
        dad.setDOB(21, 2, 1983);
        dad.setHeight(73);

        family[1] = dad;

        son.setName("Triolus", "Montague");
        son.setDOB(12, 4, 2009);
        son.setHeight(33);

        family[2] = son;

        daughter.setName("Cressida", "Montague");
        daughter.setDOB(13, 10, 2007);
        daughter.setHeight(40);

        family[3] = daughter;
        
        printPerson(family);
        
        System.out.println(" ");
        
        mum.setSurname("Montague");

        printPerson(family);

    }

    public static void printPerson(Person[] family) {
        System.out.println(family[0].getName() + " was born on " + family[0].getDOB() + ", was " + family[0].getAgeAt(7, 11, 2012) + " on the 7th of November, 2012, and is also " + family[0].getHeight());
        System.out.println(family[1].getName() + " was born on " + family[1].getDOB() + ", was " + family[1].getAgeAt(7, 11, 2012) + " on the 7th of November, 2012, and is also " + family[1].getHeight());
        System.out.println(family[2].getName() + " was born on " + family[2].getDOB() + ", was " + family[2].getAgeAt(7, 11, 2012) + " on the 7th of November, 2012, and is also " + family[2].getHeight());
        System.out.println(family[3].getName() + " was born on " + family[3].getDOB() + ", was " + family[3].getAgeAt(7, 11, 2012) + " on the 7th of November, 2012, and is also " + family[3].getHeight());

    }
}
