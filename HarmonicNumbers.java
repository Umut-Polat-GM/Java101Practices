import java.util.Scanner;
public class HarmonicNumbers {
    public static void main(String[] args) {
        int x;
        double result=0;
        Scanner input=new Scanner(System.in);
        System.out.print("Please Enter Value: ");
        x= input.nextInt();
        for (int i=1;i<=x;i++){
            result=result+(1.0/i);
        }
        System.out.println("Harmonic Result:"+result);
    }
}
