import  java.util.Scanner;

class num
{
    public static void main (String[] args)
    {
        
        Scanner scan = new Scanner (System.in);

        System.out.println("number");
        int num = scan.nextInt();

        if(num >= 10){
            System.out.println("positive number");
        }
        else if(num<10){
            System.out.println("negative number");
        }

      
        }
}