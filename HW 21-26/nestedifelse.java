import java.util.Scanner;

public class nestedifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter product category: Electronics / Clothing / Grocery: ");
        String category = sc.nextLine();
        
        System.out.print("Enter original price: $");
        double price = sc.nextDouble();
        
        System.out.print("Is customer eligible for discount? (yes/no): ");
        String discountEligible = sc.next();
        
        double discount;
        double finalPrice;
        
        if (category.equalsIgnoreCase("Electronics")) {
           
            if (discountEligible.equalsIgnoreCase("yes")) {
                discount = price * 0.10; // 10% discount
            } else {
                discount = 0;
            }
        } 
        else if (category.equalsIgnoreCase("Clothing")) {
            if (discountEligible.equalsIgnoreCase("yes")) {
                discount = price * 0.20; // 20% discount
            } else {
                discount = 0;
            }
        } 
        else if (category.equalsIgnoreCase("Grocery")) {
            if (discountEligible.equalsIgnoreCase("yes")) {
                discount = price * 0.05; // 5% discount
            } else {
                discount = 0;
            }
        } 
        else {
            System.out.println("Invalid Category!");
            sc.close();
            return;
        }
        
        finalPrice = price - discount;
        
        System.out.println("\n--- Bill ---");
        System.out.println("Category: " + category);
        System.out.println("Original Price: $" + price);
        System.out.println("Discount: $" + discount);
        System.out.println("Final Price: $" + finalPrice);
        
    
    }
}