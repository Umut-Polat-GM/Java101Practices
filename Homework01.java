import java.util.Scanner;
public class Homework01 {
    public static void main(String[] args) {
        int x,k=0,toplam=0;
        int avr;

        Scanner input=new Scanner(System.in);
        System.out.print("Enter a Value: ");
        x=input.nextInt();

        for (int i=1;i<=x;i++){


            if (i%3==0 && i%4==0){
                System.out.println("3 ve 4 e tam bolunen sayi:"+i);
                k++;
                toplam=toplam+i;

            }
            if (i==x){
                avr=toplam/k;
                System.out.println("Bu Sayilarin Ortalamasi: "+avr);
            }



        }


    }
}
