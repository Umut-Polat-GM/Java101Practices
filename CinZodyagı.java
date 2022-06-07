import java.util.Scanner;
public class CinZodyagi {
    public static void main(String[] args) {
        int Dt;
        Scanner input=new Scanner(System.in);
        System.out.print("Dogun Tarihinizi Giriniz: ");
        Dt=input.nextInt();
        if(Dt%12==0){
            System.out.println("Cin Zodyagi Burcunuz: Maymun");
        } else if (Dt%12==1) {
            System.out.println("Cin Zodyagi Burcunuz: Horoz");
        } else if (Dt%12==2) {
            System.out.println("Cin Zodyagi Burcunuz: Köpek");
        } else if (Dt%12==3) {
            System.out.println("Cin Zodyagi Burcunuz: Domuz");
        }else if (Dt%12==4) {
            System.out.println("Cin Zodyagi Burcunuz: Fare");
        }else if (Dt%12==5) {
            System.out.println("Cin Zodyagi Burcunuz: Okuz");
        }else if (Dt%12==6) {
            System.out.println("Cin Zodyagi Burcunuz: Kaplan");
        }else if (Dt%12==7) {
            System.out.println("Cin Zodyagi Burcunuz: Tavşan");
        }else if (Dt%12==8) {
            System.out.println("Cin Zodyagi Burcunuz: Ejderha");
        }else if (Dt%12==9) {
            System.out.println("Cin Zodyagi Burcunuz: Yılan");
        }else if (Dt%12==10) {
            System.out.println("Cin Zodyagi Burcunuz: At");
        }else if (Dt%12==11) {
            System.out.println("Cin Zodyagi Burcunuz: Koyun");
        }else {
            System.out.println("0'dan buyuk bir sayi giriniz.");
        }
    }
}
