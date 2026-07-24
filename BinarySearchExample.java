import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchExample {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.print("Enter number of elements: ");
int n = sc.nextInt();

int[] arr = new int[n];
System.out.println("Enter " + n + " integers (space or newline separated):");
for (int i = 0; i < n; i++) {
arr[i] = sc.nextInt();
}

Arrays.sort(arr); // ensure array is sorted for binary search
System.out.print("Enter target value to search: ");
int target = sc.nextInt();

int index = binarySearch(arr, target);
if (index >= 0) {
System.out.println("Target found at index (0-based): " + index);
} else {
System.out.println("Target not found in the array.");
}

sc.close();
}

// Iterative binary search: returns index if found, otherwise -1
public static int binarySearch(int[] arr, int target) {
int left = 0;
int right = arr.length - 1;

while (left <= right) {
int mid = left + (right - left) / 2;
if (arr[mid] == target) {
return mid;
} else if (arr[mid] < target) {
left = mid + 1;
} else {
right = mid - 1;
}
}
return -1;
}
}