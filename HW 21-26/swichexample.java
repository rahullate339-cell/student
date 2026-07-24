import java.util.Scanner;
public class swichexample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter genre code");
        System.out.println("1 for action, 2 for comedy, 3 for drama, 4 for horror, 5 for romance");
        int genrecode = sc.nextInt();

        String genreName;

        genreName = switch (genrecode) {
            case 1 -> "action";
            case 2 -> "comedy";
            case 3 -> "drama";
            case 4 -> "horror";
            case 5 -> "romance";
            default -> "invalid gener code";
        };
        System.out.println("movie gener: " + genreName);

    }
}