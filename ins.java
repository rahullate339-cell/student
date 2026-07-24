import java.util.Scanner;

public class ins {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.print("Enter number of elements: ");
int n = sc.nextInt();

int[] arr = new int[n];
System.out.println("Enter " + n + " integers (space or newline separated):");
for (int i = 0; i < n; i++) {
arr[i] = sc.nextInt();
}

insertionSort(arr);

System.out.println("Sorted array:");
for (int num : arr) {
System.out.print(num + " ");
}
System.out.println();

sc.close();
}

// Insertion sort algorithm
public static void insertionSort(int[] arr) {
for (int i = 1; i < arr.length; i++) {
int key = arr[i];
int j = i - 1;

// Move elements of arr[0..i-1] that are greater than key
// to one position ahead of their current position
while (j >= 0 && arr[j] > key) {
arr[j + 1] = arr[j];
j--;
}
arr[j + 1] = key;
}
}
}