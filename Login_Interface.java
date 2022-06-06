import java.util.Scanner;
public class Login {
    public static void main(String[] args) {

        String userName,password;
        Scanner input=new Scanner(System.in);
        System.out.print("userName: ");
        userName=input.nextLine();
        System.out.print("password: ");
        password=input.nextLine();

        if (userName.equals("user") && password.equals("user1234")){

            System.out.print("Login is succesfull.");
        }else{
            System.out.print("Wrong process");
        }
    }
}
