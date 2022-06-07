import java.util.Scanner;
public class Combination {
    public static void main(String[] args) {
        int n,r,f1=1,f2=1,f3=1;
        Scanner input=new Scanner(System.in);

        System.out.print("n nin: ");
        n= input.nextInt();
        System.out.print("r' li kombinasyonu: ");
        r= input.nextInt();
        for (int i=1;i<=n;i++){
            f1=f1*i;
        }
        for (int j=1;j<=r;j++){
            f2=f2*j;
        }
        for (int k=1;k<=(n-r);k++){
            f3=f3*k;
        }
        System.out.print("n'nin r'l kombinasyonu: ");
        System.out.println(f1/(f2*f3));


    }
}
