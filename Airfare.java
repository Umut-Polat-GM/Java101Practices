import java.util.Scanner;
public class Airfare {
    public static void main(String[] args) {
        double KM,price,discount,Total;
        int age,TT;
        price=0.1;
        Scanner input=new Scanner(System.in);
        System.out.print("Trip Distance: ");
        KM=input.nextDouble();
        System.out.print("How Old Are You: ");
        age=input.nextInt();
        System.out.print("Select the trip type One way(1) or Round trip(2): ");
        TT=input.nextInt();
        if(KM>0 && KM<10000){
            if(TT==1){

                    if (age<12){
                        discount=0.5;
                        Total=KM*price-(KM*price*discount);
                        System.out.println("Total: "+Total+"TL");
                    } else if (age>=12 && age<=24) {
                        discount=0.1;
                        Total=KM*price-(KM*price*discount);
                        System.out.println("Total: "+Total+"TL");
                    } else if (age>65) {
                        discount=0.3;
                        Total=KM*price-(KM*price*discount);
                        System.out.println("Total: "+Total+"TL");
                    }else {
                        discount=0;
                        Total=KM*price-(KM*price*discount);
                        System.out.println("Total: "+Total+"TL");
                    }
            } else if (TT==2) {
                if (age<12){
                    discount=0.5;
                    Total=KM*price-(KM*price*discount);
                    System.out.println("Total: "+(Total-Total*0.2)*2+"TL");
                } else if (age>=12 && age<=24) {
                    discount=0.1;
                    Total=KM*price-(KM*price*discount);
                    System.out.println("Total: "+(Total-Total*0.2)*2+"TL");
                } else if (age>65) {
                    discount=0.3;
                    Total=KM*price-(KM*price*discount);
                    System.out.println("Total: "+(Total-Total*0.2)*2+"TL");
                }else {
                    discount=0;
                    Total=KM*price-(KM*price*discount);
                    System.out.println("Total: "+(Total-Total*0.2)*2+"TL");
                }
            } else {
                System.out.println("Wring trip Type");
            }
        }else {
            System.out.println("Wrong KM Value");
        }

    }
}
