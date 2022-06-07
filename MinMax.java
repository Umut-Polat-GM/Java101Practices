import java.util.Scanner;
public class MinMax {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int N,i,sayi,max=0,min=0;
        System.out.print("Kac tane sayi gireceksiniz:");
        N=input.nextInt();
        for (i=1;i<=N;i++){

            System.out.print(i+". Sayiyi giriniz:");
            sayi=input.nextInt();

            if (i==1){
                max=sayi;
                min=sayi;
            }else{
                if (sayi>max){
                    max=sayi;
                } else if (sayi<min) {
                    min=sayi;
                }
            }
        }
        System.out.println("En buyuk sayi:"+max);
        System.out.println("En kucuk sayi:"+min);

    }
}
