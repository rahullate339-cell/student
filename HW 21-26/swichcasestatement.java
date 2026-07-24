import java.util.Scanner;

public class  swichcasestatement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Marks: ");
        int marks = sc.nextInt();

        switch  (marks / 10) {
    
            case 1 -> System.out.println("Grade A");
                
            case 2 -> System.out.println("Grade B");
               
            case 3 -> System.out.println("Grade C");
               
            case 4 -> System.out.println("Grade D");
              
            default -> System.out.println("Grade F");
        }
    }
}