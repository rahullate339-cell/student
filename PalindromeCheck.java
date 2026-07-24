import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a value: ");
        String input = sc.nextLine();

        String reverse = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reverse += input.charAt(i);
        }

        if (input.equalsIgnoreCase(reverse)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }

        sc.close();
    }
}