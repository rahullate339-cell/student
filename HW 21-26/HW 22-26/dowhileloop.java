public class dowhileloop {
    public static void main(String[] args) {

        int i = 2;

        do {
            if (i % 5 == 0) {
                break;
            }

            System.out.println(i);
            i = i + 2;

        } while (i <= 20);
    }
}