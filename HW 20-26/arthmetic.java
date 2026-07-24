import java.util.Scanner;
public class arthmetic {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Mobile Recharge: ");
        double recharge = sc.nextDouble();

        System.out.print("Enter Electricity Bill: ");
        double  bill = sc.nextDouble();

        System.out.print("Enter House Rent: ");
        double  rent = sc.nextDouble();

        double total =  recharge +  bill  +  rent;

        System.out.println("Total Expenses = " + total);

        sc.close();

    }
}