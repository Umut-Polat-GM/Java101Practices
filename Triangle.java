import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        //"u" Perimeter, "A" Area
        double a,b,c,u,A;
        Scanner edge=new Scanner(System.in);
        System.out.print("1.Edge: ");
        a=edge.nextInt();
        System.out.print("2.Edge: ");
        b=edge.nextInt();

        c=Math.sqrt(a*a+b*b);
        System.out.println("3.Edge : "+c);
        //Perimeter=2u (u = (a+b+c) / 2)
        u=(a+b+c)/2;
        System.out.println("Perimeter: "+(2*u));
        //Area*Area=u * (u − a)* (u − b) * (u − c)
        A=Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.print(("Area: "+A));

    }
}
