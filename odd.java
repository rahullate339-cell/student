input java.util.Scanner;
class oddajava {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);

        System.out.println("enter number");
        int num=scan.nextInt();

        if(num%7==0){
            System.out.println("odd number");

        }
        else{
            System.out.println("even number");
        }
    }
}