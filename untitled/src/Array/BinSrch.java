package Array;
// Binary Search
import java.util.Scanner;
public class BinSrch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Array Length: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter sorted array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter element to search: ");
        int cammy = sc.nextInt();
        int beg = 0;
        int end = n - 1;
        int mid = beg + end / 2;
        while (beg <= end) {
            mid = beg + (end-beg)/ 2;
            if (arr[mid] == cammy) {
                System.out.println("found");
                return;
            }
            else if (arr[mid] < cammy) {
                beg = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        System.out.println("not found");
        }
}