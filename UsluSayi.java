import java.util.Scanner;
public class UsluSayi {
    public static void main(String[] args) {
        int n,k,total=1;
        Scanner input=new Scanner(System.in);

        System.out.print("Ussu Alinicak Sayi: ");
        n=input.nextInt();
        System.out.print("Us olaracak Sayi: ");
        k=input.nextInt();

        for (int i=1;i<=k;i++){
            total *=n;
        }

        System.out.println("Cevap: "+total);
    }
}
