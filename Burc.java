import java.util.Scanner;
public class Burc {
    public static void main(String[] args) {
        int day,mount;
        String burc=" ";
        boolean isError=false;
        Scanner input=new Scanner(System.in);
        System.out.print("Dogdugunuz gun: ");
        day=input.nextInt();
        System.out.print("Dogdugunuz ay: ");
        mount=input.nextInt();

        if(mount==1){
            if(day>0 && day<=21){
                burc="Oğlak";
            } else if (day>21 && day<31) {
                burc="Kova";
            }else{
                isError=true;
            }
        }
        if(mount==2){
            if(day>0 && day<=19){
                burc="Kova";
            } else if (day>19 && day<28) {
                burc="Balık";
            }else{
                isError=true;
            }
        }
        if(mount==3){
            if(day>0 && day<=20){
                burc="Balık";
            } else if (day>21 && day<31) {
                burc="Koc";
            }else{
                isError=true;
            }
        }
        if(mount==4){
            if(day>0 && day<=20){
                burc="Koc";
            } else if (day>21 && day<30) {
                burc="Boğa";
            }else{
                isError=true;
            }
        }
        if(mount==5){
            if(day>0 && day<=21){
                burc="Boğa";
            } else if (day>21 && day<31) {
                burc="İkizler";
            }else{
                isError=true;
            }
        }
        if(mount==6) {
            if (day > 0 && day <= 21) {
                burc = "ikizler";
            } else if (day > 21 && day < 30) {
                burc = "Yengec";
            } else {
                isError = true;
            }
        }
        if(mount==7) {
            if (day > 0 && day <= 22) {
                burc = "Yengec";
            } else if (day > 22 && day < 31) {
                burc = "Aslan";
            } else {
                isError = true;
            }
        }
        if(mount==8){
            if(day>0 && day<=22){
                burc="Aslan";
            } else if (day>22 && day<31) {
                burc="Basak";
            }else{
                isError=true;
            }
        }
        if(mount==9){
            if(day>0 && day<=22){
                burc="Basak";
            } else if (day>22 && day<30) {
                burc="Terazi";
            }else{
                isError=true;
            }
        }
        if(mount==10){
            if(day>0 && day<=22){
                burc="Terazi";
            } else if (day>22 && day<31) {
                burc="Akrep";
            }else{
                isError=true;
            }
        }
        if(mount==11){
            if(day>0 && day<=21){
                burc="Akrep";
            } else if (day>21 && day<30) {
                burc="Yay";
            }else{
                isError=true;
            }
        }
        if(mount==12){
            if(day>0 && day<=22){
                burc="Yay";
            } else if (day>22 && day<31) {
                burc="Oglak";
            }else{
                isError=true;
            }
        }
        if (isError){
            System.out.println("Girdiginiz Deger Hatali!!!");
        }else {
            System.out.println("Burcunuz: "+burc);
        }


    }
}
