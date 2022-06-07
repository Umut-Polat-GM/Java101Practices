import java.util.Scanner;
public class Recursive {

    static int Recursive(int N){
        int temp=N;
        System.out.print(temp+" ");


       do {
            temp-=5;
            System.out.print(temp+" ");
        }while(temp>0);
        do {
            temp+=5;
            System.out.print(temp+" ");
        }while(temp!=N);


        return temp;

    }


    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("N Sayisi:");
        int N=input.nextInt();
        Recursive(N);

    }


}
