import java.util.Scanner;

public class nested {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter total amount spent: $");
        double amount = sc.nextDouble();
        
        double shippingCost;
    
        if (amount >= 100) {
            shippingCost = 0;
            System.out.println("Shipping is FREE");
        } 
        else {
            if (amount >= 50) {
                shippingCost = 5;
                System.out.println("Shipping cost: $5");
            } 
            else { 
                shippingCost = 10;
                System.out.println("Shipping cost: $10");
            }
        }
        
        System.out.println("Total amount to pay: $" + (amount + shippingCost));
    
    }
}