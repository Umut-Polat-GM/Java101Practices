import java.util.Scanner;
public class Recommendation {
    public static void main(String[] args) {

        double heat;
        Scanner input=new Scanner(System.in);

        System.out.print("Enter Temperature: ");
        heat=input.nextDouble();
        if (heat<5){
            System.out.print("You can go ski.");
        } else if (heat>5 && heat<15) {
            System.out.print("You can go cinema.");
        } else if (heat>15 && heat<25) {
            System.out.print("You can go picnic.");
        }else {
            System.out.print("You can go swimmming.");
        }

    }
}
