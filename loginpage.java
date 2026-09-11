import java.util.Scanner;

public class loginpage {
    public static void main (String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your username");
        String username = sc.nextLine();


        System.out.println("Enter your password");
        String password = sc.nextLine();


        if(username.equals("Rahul") && password.equals("1220")){
            System.out.println("Login successful");
        }
        else{
            System.out.println("Login failed");
        }
    }
}