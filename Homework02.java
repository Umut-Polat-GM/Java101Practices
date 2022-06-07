import java.util.Scanner;
public class Homework02 {
    public static void main(String[] args) {
        int x,sum=0;
        boolean istrue=true;
        Scanner input=new Scanner(System.in);

        do {
            System.out.print("Enter Value:");
            x=input.nextInt();
            if (x%4==0){
                sum +=x;
            } else if (x%2==1 || x<0) {
                istrue=false;
            }
        }while(istrue);

        System.out.println("Summing:"+sum);
    }
}
