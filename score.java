import  java.util.Scanner;

class score{

    public static void main(String[]args){

        Scanner scan = new Scanner (System.in);

        System.out.println("enter marks");
        int marks = scan.nextInt();

        if(marks >= 100){
            System.out.println("Perfect Score ");
        }
               else if(marks >= 70){
            System.out.println("good score");}

               else if (marks>= 40){
            System.out.println("average score");
            }
               else{ System.out.println("fail");
            }

        }
        
        }
        
        