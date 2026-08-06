import java.util.Scanner;
public class program1 {

    public static void main (String[]args){
    Scanner rahul = new Scanner (System.in);

     System.out.println("enter your password");
        String password = rahul.nextLine();

        if(password.equals("RAHUL1220")){
            System.out.println("Login Successful");
        }
        else{
            System.out.println("Wrong Password");
        }
        

    }
    }