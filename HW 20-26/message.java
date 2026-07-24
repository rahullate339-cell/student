import java.util.Scanner;

public class message {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your favorite hobby: ");
        String hobby = sc.nextLine();

        String message = "Welcome " + name + "! Your favorite hobby is " + hobby + ".";

        System.out.println(message);

        sc.close();
    }
}