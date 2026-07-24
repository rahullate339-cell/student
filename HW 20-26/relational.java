public class relational {
    public static void main(String[] args) {
         
         int minaSalary = 50000;
         int simaSalary = 90000;

         System.out.println("mina Salary: " + minaSalary);
         System.out.println("sima Salary: " + simaSalary);

         System.out.println("mina > sima : " + (minaSalary > simaSalary));
          System.out.println("mina < sima : " + (minaSalary < simaSalary));
           System.out.println("mina == sima : " + (minaSalary == simaSalary));
            System.out.println("mina != sima : " + (minaSalary != simaSalary));
             System.out.println("mina >= sima : " + (minaSalary >= simaSalary));
              System.out.println("mina <= sima : " + (minaSalary <= simaSalary));

              if (minaSalary > simaSalary) {

                System.out.println("mina salary is better than sima.");
              } else if (minaSalary < simaSalary){
                System.out.println("sima salary is better than mina.");
              } else {
                System.out.println("both salary is equal.");
              }


    }
}