import java.util.Scanner;
public class Homework03 {
    public static void main(String[] args) {
        int x;
        Scanner input=new Scanner(System.in);
        System.out.print("Sinir Sayisini Giriniz: ");
        x=input.nextInt();
        System.out.println("----4'un kuvvetleri---");
        for (int i=1;i<=x;i*=4){
            System.out.println(i);
        }
        System.out.println("----5'in kuvvetleri---");
        for (int j=1;j<=x;j*=5){
            System.out.println(j);
        }
    }
}
