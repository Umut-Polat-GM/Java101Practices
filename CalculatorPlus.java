import java.util.Scanner;

public class Calculator {

    static int sum(int a,int b){
        int result=a+b;
        System.out.println("Sonuc:"+result);
        return result;
    }
    static int minus(int a,int b){
        int result=a-b;
        System.out.println("Sonuc:"+result);
        return result;
    }
    static int times(int a,int b){
        int result=a*b;
        System.out.println("Sonuc:"+result);
        return result;
    }
    static int divided(int a,int b){
        if (b==0){
            System.out.println("2. Sayi '0' olamaz.");
            return 0;
        }
        int result=a/b;
        System.out.println("Sonuc:"+result);
        return result;
    }
    static void power(int a,int b){
        int result=(int)(Math.pow(a,b));
        System.out.println("Sonuc:"+result);
    }
    static void factoriel(int c){
        int result=1;
        for (int i=1;i<=c;i++){
            result*=i;
        }
        System.out.println("Sonuc:"+result);
    }
    static void mod(int a,int b){
        int result=a%b;
        System.out.println("Sonuc:"+result);
    }
    static void rect(int a,int b){
        int result1=2*(a+b);
        int result2=a*b;
        System.out.println("Cevre:"+result1);
        System.out.println("Alan:"+result2);
    }


    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";
        System.out.println(menu);

        while(true){
            System.out.print("Isleminizi Secin:");
            int select= input.nextInt();

            if (select>0 && select<=8 && select!=6){
                System.out.print("1.Sayi:");
                int a= input.nextInt();
                System.out.print("2.Sayi:");
                int b= input.nextInt();

                switch (select) {
                    case 1:
                        sum(a, b);
                        break;
                    case 2:
                        minus(a,b);
                        break;
                    case 3:
                        times(a,b);
                        break;
                    case 4:
                        divided(a,b);
                        break;
                    case 5:
                        power(a,b);
                        break;

                    case 7:
                        mod(a,b);
                        break;
                    case 8:
                        rect(a,b);
                        break;

                    default:


                }
            }
            else{
                if (select==6) {
                    System.out.print("Faktoril:");
                    int c = input.nextInt();
                    factoriel(c);
                } else if (select==0) {
                    System.out.println("Gule Gule");
                    break;

                } else{
                    System.out.println("Yanlis Bir Sayi Sectiniz");
                }

            }




        }
    }
}
