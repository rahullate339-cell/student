import java.util.Scanner;
class divisible {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);

        System.out.println("enter number");
        int num = scan.nextInt();

        if(num%5==0){
            System.out.println("divisible by 5 ");
        }
        else{
            System.out.println("not divisible by 5");
        }


    }
}