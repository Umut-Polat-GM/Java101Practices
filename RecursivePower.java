import java.util.Scanner;
public class RecursivePower {

    static int RecursivePower(int base,int power){
        if(power==0) {
            return 1;
        }
        return base*RecursivePower(base,power-1);
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        while (true) {
            System.out.print("Base:");
            int base = input.nextInt();
            System.out.print("Power:");
            int power = input.nextInt();
            System.out.println("Sonuc:"+RecursivePower(base,power));
        }

    }
}
