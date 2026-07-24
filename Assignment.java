import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1. Declare variables
        System.out.println("1. Declare Variables");
        int i = 10;
        double d = 25.75;
        char c = 'A';
        boolean b = true;

        System.out.println("int = " + i);
        System.out.println("double = " + d);
        System.out.println("char = " + c);
        System.out.println("boolean = " + b);

        // 2. Size of data types
        System.out.println("\n2. Size of Data Types");
        System.out.println("int = " + Integer.BYTES + " bytes");
        System.out.println("float = " + Float.BYTES + " bytes");
        System.out.println("double = " + Double.BYTES + " bytes");
        System.out.println("char = " + Character.BYTES + " bytes");

        // 3. Double to int
        System.out.println("\n3. Double to Int");
        double num = 45.89;
        int numInt = (int) num;
        System.out.println("Original = " + num);
        System.out.println("After Casting = " + numInt);

        // 4. Store large number in long
        System.out.println("\n4. Long Example");
        long big = 5000000000L;
        System.out.println("Long value = " + big);
        int small = (int) big;
        System.out.println("After int casting = " + small);

        // 5. String to int
        System.out.println("\n5. String to Int");
        String str = "123";
        try {
            int value = Integer.parseInt(str);
            System.out.println("Converted = " + value);
        } catch (NumberFormatException e) {
            System.out.println("Invalid Number");
        }

        // 6. Int to String
        System.out.println("\n6. Int to String");
        int x = 100;

        String s1 = String.valueOf(x);
        String s2 = x + "";
        String s3 = Integer.toString(x);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        // 7. Implicit Casting
        System.out.println("\n7. Implicit Casting");
        int a = 50;
        double dd = a;
        System.out.println("int = " + a);
        System.out.println("double = " + dd);

        // 8. Explicit Casting
        System.out.println("\n8. Explicit Casting");
        double p = 99.99;
        int q = (int) p;
        System.out.println("double = " + p);
        System.out.println("int = " + q);

        // 9. Min and Max Values
        System.out.println("\n9. Min and Max Values");
        System.out.println("Byte: " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);
        System.out.println("Short: " + Short.MIN_VALUE + " to " + Short.MAX_VALUE);
        System.out.println("Int: " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
        System.out.println("Long: " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);

        // 10. Swap without third variable
        System.out.println("\n10. Swap Without Third Variable");
        int n1 = 20, n2 = 30;
        System.out.println("Before: " + n1 + " " + n2);
        n1 = n1 + n2;
        n2 = n1 - n2;
        n1 = n1 - n2;
        System.out.println("After: " + n1 + " " + n2);

        // 11. Char Arithmetic
        System.out.println("\n11. Char Arithmetic");
        char letter = 'A';
        System.out.println("Current = " + letter);
        System.out.println("Next = " + (char)(letter + 1));

        // 12. User Input
        System.out.println("\n12. User Input");
        System.out.print("Enter Name: ");
        String name = sc.next();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        System.out.println("My name is " + name + ", I am " + age +
                " years old and my salary is " + salary);

        // 13. Float vs Double Precision
        System.out.println("\n13. Float vs Double Precision");
        float f = 10f / 3;
        double db = 10.0 / 3;

        System.out.println("Float = " + f);
        System.out.println("Double = " + db);

        sc.close();
    }
}