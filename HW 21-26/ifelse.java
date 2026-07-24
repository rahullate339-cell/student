import java.util.Scanner;

class ifelse{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("enter your password");
        String password = scan.nextLine();

        if(password.equals("rahul123")){

            System.out.println("login successful");
        }
        else{
            System.out.println("wrong password");

        }
        }
    }
