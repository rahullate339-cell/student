import java.util.Scanner;

class age
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("enter age");
        int age = scan.nextInt();

        if(age >= 20){
            System.out.println("eligible for voting");
        }
        else if(age>15){
            System.out.println("not eligible for voting");
        }
    }
}