public class assignment {
    public static void main(String[] args) {
        int saving = 1000;

        System.out.println("Initial saving: " + saving);

        saving += 500;
         System.out.println("After saving 500: " + saving);

        saving -= 200;
         System.out.println("After Spending 300: " + saving);

        saving *= 2;
         System.out.println("After Doubling saving: " + saving);

        saving /= 2;
         System.out.println("After Dividing by 2: " + saving);

             saving %= 300;

             System.err.println("Remainder after dividing by 300: " + saving);


        
    }
}