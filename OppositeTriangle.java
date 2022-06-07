import java.util.Scanner;
public class OppositeTriangle {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n;
        System.out.print("Basamak Sayisi:");
        n=input.nextInt();


        for (int m=1;m<=n;m++){

            for (int x=1;x<=m;x++){
                System.out.print(" ");
            }
            for (int y=1;y<=2*(n-m+1)-1;y++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
