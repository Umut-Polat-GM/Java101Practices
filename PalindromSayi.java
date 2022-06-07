public class PalindromSayi {
    static boolean isPalindrom(int number){

        int term, lastnumber,reversenumber=0;

        term=number;

        while (term!=0) {

            lastnumber = term % 10;
            reversenumber=(reversenumber*10)+lastnumber;
            term /= 10;
        }

        if (reversenumber==number)
            return true;
        else
            return false;

    }

    public static void main(String[] args) {
        System.out.println(isPalindrom(4004));
    }
}
