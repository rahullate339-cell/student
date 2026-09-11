import java.io.FileReader;
import java.io.IOException;
 
 public class reader {
        public static void main(String[] args) {

        try{
            FileReader Rahul=new FileReader("text.txt");
            System.out.println("File opened");
            
        }
        catch(IOException e) {
            System.out.println("File not found");
        }
    }
 }