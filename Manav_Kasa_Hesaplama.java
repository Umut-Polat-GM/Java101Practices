import java.util.Scanner;

public class Manav {
    public static void main(String[] args) {

        double Armut,Elma,Domates,Muz,Patlican,SA,SE,SD,SM,SP,Total;          // S satılan anlamına geliyor.SA Satılan Armut demek.

        Armut=2.14;
        Elma=3.67;
        Domates=1.11;
        Muz=0.95;
        Patlican=5;

        Scanner tr=new Scanner(System.in);

        System.out.println("Aldiginiz Urunlerin kg olarak belirtiniz!");

        System.out.print("Armut:");
        SA=tr.nextDouble();
        System.out.print("Elma:");
        SE=tr.nextDouble();
        System.out.print("Domates:");
        SD=tr.nextDouble();
        System.out.print("Muz:");
        SM=tr.nextDouble();
        System.out.print("Patlican:");
        SP=tr.nextDouble();

        Total=(Armut*SA+Elma*SE+Domates*SD+Muz*SM+Patlican*SP);

        System.out.print("Toplam Tutari: "+Total);

    }
}
