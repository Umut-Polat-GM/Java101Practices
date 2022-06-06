import java.util.Scanner;

    public class Calculator {
        public static void main(String[] args) {

            double n1,n2;
            Scanner input=new Scanner(System.in);

            System.out.print("1. value: ");
            n1=input.nextDouble();
            System.out.print("2. value: ");
            n2=input.nextDouble();
            System.out.println("Chose the Action Please ");
            System.out.print(" 1.Summing\n 2.Extraction\n 3.Impact\n 4.Divide\n ");
            int Select=input.nextInt();

            switch (Select) {

                case 1:
                    System.out.print("Summing= "+(n1+n2));
                    break;
                case 2:
                    System.out.print("Extraction= "+(n1-n2));
                    break;
                case 3:
                    System.out.print("Impact= "+(n1*n2));
                    break;
                case 4:
                    if (n2 != 0)
                    {
                    System.out.print("Divide= "+(n1/n2));
                    }
                    else {
                        System.out.print("Any value cant divide 0!!!");
                    }
                    break;
                default:
                    System.out.print("Wrong Select!");
            }

        }
}
