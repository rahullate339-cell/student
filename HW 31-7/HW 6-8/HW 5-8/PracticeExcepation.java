import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;

public class PracticeExcepation {
    public static void main(String[] args) {
        try {
            FileReader f = new FileReader("abc.txt");
            System.out.println("File opened");
        } catch (Exception e) {
            System.out.println("File not found");
        }
    }
}


                                                // Code 2: IOException                                

class Test2 {
    public static void main(String[] args) {
        try {
            throw new IOException("Input Error");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}


                                             // Code 3: InterruptedException


 class Test3 {
    public static void main(String[] args) {
        try {
            Thread.sleep(1000);
            System.out.println("Hello");
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
    }
}



                                             // Code 4: ClassNotFoundException
class Test4 {
    public static void main(String[] args) {
        try {
            Class.forName("ABC");
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found");
        }
    }
}


                                           // Code 5: SQLException

class Test5 {
    public static void main(String[] args) {
        try {
            throw new SQLException("Database Error");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
                                   // 2. Unchecked Exception — 5 Codes
                                 // Code 1: ArithmeticException



 class Test6 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        System.out.println(a / b);
    }
}
                                      // Code 2: NullPointerException


 class Test7 {
    public static void main(String[] args) {
        String name = null;

        System.out.println(name.length());
    }
}
                                         // Code 3: ArrayIndexOutOfBoundsException



 class Test8 {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30};

        System.out.println(arr[5]);
    }
}
                                           // Code 4: NumberFormatException


 class Test9 {
    public static void main(String[] args) {
        String s = "abc";

        int n = Integer.parseInt(s);

        System.out.println(n);
    }
}
                                           // Code 5: StringIndexOutOfBoundsException



 class Test10 {
    public static void main(String[] args) {
        String name = "Java";

        System.out.println(name.charAt(10));
    }
}