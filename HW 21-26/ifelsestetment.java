import java.util.Scanner;
public class ifelsestetment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter age:");
        int age = sc.nextInt();

        System.out.println("Do you have valid driving license? (yes/no): ");
        String license = sc.next();

        license = license.toLowerCase();

        if (age >= 18 && license.equals("yes")) {
            System.out.println("you are eligible to drive");
        }
        else if (age < 18) {
            System.out.println("you are not eligible to drive.");
        }
        else if (!license.equals("yes")) {
            System.out.println("you are not eligible todrive.");
        }
        else {
            System.out.println("you are not eligible to drive.");
        }
    }
}