import java.util.Scanner;
public class Placement {
    public static void main(String[] args) {
        int a,b,c;
        Scanner input=new Scanner(System.in);
        System.out.print("1. Value: ");
        a= input.nextInt();
        System.out.print("2. Value: ");
        b= input.nextInt();
        System.out.print("3. Value: ");
        c= input.nextInt();

        if (a < b && a < c){
            if ( b < c ){
                System.out.print(a +"<"+ b +"<"+c);
            }else {
                System.out.print(a+"<"+ c +"<"+b);
            }
        } else if ( b < a && b < c ) {
            if (a<c){
                System.out.println(b+"<"+ a +"<"+ c);
            }else{
                System.out.println(b+"<"+ c +"<"+ a);
            }

        }else{
            if(b<a){
                System.out.println(c+"<"+b+"<"+ a);
            }else{
                System.out.println(c+"<"+ a +"<"+ b);
            }
        }
    }
}
