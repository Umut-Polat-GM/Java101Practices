import java.util.Scanner;
public class EbobEkok {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int x,y;
        System.out.print("1.Value:");
        x=input.nextInt();
        System.out.print("2.Value:");
        y=input.nextInt();
        int ebob=1,ekok=1;
        int i=1,j=1;

        while (i<x && i<y){

            if (x%i==0 && y%i==0){
                ebob=i;

            }
            i++;

        }
        System.out.println("Ebob:"+ebob);

        while(j<x*y){

            if (j%x==0 && j%y==0){
                ekok=j;

            }
            j++;

        }
        System.out.println("Ekok:"+ekok);

    }
}
