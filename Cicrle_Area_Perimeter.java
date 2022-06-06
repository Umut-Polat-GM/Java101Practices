import java.util.Scanner;

public class Crc {
    public static void main(String[] args) {

        double r,A,P,pi;                //"A" Area  "P" Perimeter

        pi=3.14;

        Scanner dia=new Scanner(System.in);

        System.out.print("What is the S.diameter: ");
        r=dia.nextDouble();
        A=pi*r*r;
        P=2*pi*r;
        System.out.println("Area: "+A);
        System.out.println("Perimeter: "+P);
    }
}
