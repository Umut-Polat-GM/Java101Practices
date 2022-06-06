import java.util.Scanner;
public class Class {
    public static void main(String[] args) {

        int math,physic,turkish,chemical,music;
        Scanner input=new Scanner(System.in);

        System.out.print("Math Point: ");
        math= input.nextInt();

        System.out.print("Physic Point: ");
        physic= input.nextInt();

        System.out.print("Turkish Point: ");
        turkish= input.nextInt();

        System.out.print("Chemical Point: ");
        chemical= input.nextInt();

        System.out.print("Music Point: ");
        music= input.nextInt();

        double Avarage;

        Avarage= (math+physic+turkish+chemical+music) / 5F;

        if (Avarage>100){
            System.out.print("Check your points.");
        }else if (Avarage>=55)
        {
            System.out.print("Congratulations Passed the Class.");
        }else
        {
            System.out.print("You failed");
        }
        System.out.print("Your Avarage:"+Avarage);
    }
}
