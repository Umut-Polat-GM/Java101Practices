import java.util.Scanner;

public class Avarage {
    public static void main(String[] args) {

        Scanner les=new Scanner(System.in);

        //Math,Physic,Chemical,Turkish,Music,History average point

        int Math,Physic,Chemical,Turkish,Music,History;

        System.out.print("Math:");
        Math=les.nextInt();

        System.out.print("Physic:");
        Physic=les.nextInt();

        System.out.print("Chemical:");
        Chemical=les.nextInt();

        System.out.print("Turkish:");
        Turkish=les.nextInt();

        System.out.print("Music:");
        Music=les.nextInt();

        System.out.print("History:");
        History=les.nextInt();

        double Average;
        Average=(Math+Physic+Chemical+Turkish+Music+History)/6;
        System.out.println("Avarege: "+Average);

        String Final=(Average>=50)? "Passed" : "Remain";
        System.out.print("Final: "+Final);

    }
}
