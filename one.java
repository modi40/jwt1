import java.util.Scanner;
import java.util.Arrays;

public class one {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter number of elements: ");
int n = sc.hasNextInt() ? sc.nextInt() : 5;
int[] arr = new int[n];
int sum = 0;
System.out.println("Enter " + n + " elements:");
for (int i = 0; i < n; i++) {
arr[i] = sc.hasNextInt() ? sc.nextInt() : (i + 1) * 3;
sum += arr[i];
}
Arrays.sort(arr);
System.out.println("Sum of elements: " + sum);
System.out.print("Elements in ascending order: ");
for (int i = 0; i < n; i++) {
System.out.print(arr[i] + " ");
}
System.out.println();
sc.close();
}
}
