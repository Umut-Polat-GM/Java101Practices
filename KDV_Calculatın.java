import java.util.Scanner;

public class KDV {
    public static void main(String[] args) {

        Scanner Prc=new Scanner(System.in);
        Double Price;

        System.out.print("Enter the Price: ");
        Price=Prc.nextDouble();
        if (Price<=1000){

            System.out.println("KDV'siz fiyat: "+Price);
            System.out.println("KDV'li fiyat "+(Price+Price*0.18));
            System.out.println("KDV: "+Price*0.18);
        }

        if (Price>1000){

            System.out.println("KDV'siz fiyat: "+Price);
            System.out.println("KDV'li fiyat "+(Price+Price*0.08));
            System.out.println("KDV: "+Price*0.08);
        }

    }
}
