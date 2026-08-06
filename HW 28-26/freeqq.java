public class freeqq {
    public static void main(String[] args) {
            int[] arr = {10,68,48,20,20,48,10,46};


        for (int i = 0; i < arr.length; i++) {
        int count = 0;

        for (int j = 0; j < arr.length; j++) {

        if (arr[i] == arr[j]) {
        count++;
       }
            }

            System.out.println(arr[i] + " = " + count);
        }
    }
}