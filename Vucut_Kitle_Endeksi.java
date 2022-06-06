import java.util.Scanner;

public class V_K_E {
    public static void main(String[] args) {

        double m,kg,v;   //v-->vucut kitle endeksi

        Scanner vk=new Scanner(System.in);

        System.out.print("Boyunuz: ");
        m=vk.nextDouble();

        System.out.print("Kilonuz: ");
        kg=vk.nextDouble();

        v=kg/(m*m);

        System.out.print("Vucut Kitle Endeksiniz: "+v);

    }
}
