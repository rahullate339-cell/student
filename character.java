import java.util.Scanner;

public class character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Uppercase Letter");
        } else {
            System.out.println("Not an Uppercase Letter");
        }
    }}