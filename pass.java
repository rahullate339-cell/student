import java.util.Scanner;

class pass{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("enter your password");
        String password = scan.nextLine();

        if(password.equals("java123")){

            System.out.println("login successful");
        }
        else{
            System.out.println("wrong password");

        }
        }
    }
