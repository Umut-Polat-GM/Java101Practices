import java.util.Scanner;
public class FibonacciNumbers {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n,ilk=0,son=1,result,i;
        System.out.print("Enter The Fibonnacci Value:");
        n= input.nextInt();

        System.out.print(ilk+" "+son);

        for (i=1;i<n;i++){

            result=ilk+son;
            System.out.print(" "+result);
            ilk=son;
            son=result;

        }


    }
}
