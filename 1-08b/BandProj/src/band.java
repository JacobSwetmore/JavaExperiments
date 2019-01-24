import java.util.*;
public class band {

    public static void main(String[] args) {

        Scanner kybd = new Scanner(System.in);
        BandMember[] member = new BandMember[5];
        BandMember member1 = new BandMember();
        BandMember member2 = new BandMember();
        BandMember member3 = new BandMember();
        BandMember member4 = new BandMember();
        BandMember member5 = new BandMember();

        System.out.println("Please enter the stage name of member one: ");
        member1.setName(kybd.nextLine());
        System.out.println("Please enter the instrument that " + member1.getName() + " plays: ");
        member1.setInstrument(kybd.nextLine());
        member[0] = member1;

        System.out.println("Please enter the stage name of member two: ");
        member2.setName(kybd.nextLine());
        System.out.println("Please enter the instrument that " + member2.getName() + " plays: ");
        member2.setInstrument(kybd.nextLine());
        member[1] = member2;

        System.out.println("Please enter the stage name of member three: ");
        member3.setName(kybd.nextLine());
        System.out.println("Please enter the instrument that " + member3.getName() + " plays: ");
        member3.setInstrument(kybd.nextLine());
        member[2] = member3;

        System.out.println("Please enter the stage name of member four: ");
        member4.setName(kybd.nextLine());
        System.out.println("Please enter the instrument that " + member4.getName() + " plays: ");
        member4.setInstrument(kybd.nextLine());
        member[3] = member4;

        System.out.println("Please enter the stage name of member five: ");
        member5.setName(kybd.nextLine());
        System.out.println("Please enter the instrument that " + member5.getName() + " plays: ");
        member5.setInstrument(kybd.nextLine());
        member[4] = member5;

        printMember(member);
    }

    public static void printMember(BandMember[] member) {
        System.out.println(member[0].getName() + " is a " + member[0].getInstrument());
        System.out.println(member[1].getName() + " is a " + member[1].getInstrument());
        System.out.println(member[2].getName() + " is a " + member[2].getInstrument());
        System.out.println(member[3].getName() + " is a " + member[3].getInstrument());
        System.out.println(member[4].getName() + " is a " + member[4].getInstrument());
    }
}
