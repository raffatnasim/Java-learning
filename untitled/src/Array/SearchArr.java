package Array;
//user input an array and searching number.Find searching number in array.
import java.util.Scanner;
public class SearchArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Array Length: ");
        int D = sc.nextInt();
        int[] arr = new int[D];
        System.out.println("input searching no.");
        int sadma = sc.nextInt();
        System.out.println("Array Element: ");
        for (int i = 0; i <= D - 1; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i <= D - 1; i++) {
            if (arr[i] == sadma) {
                System.out.println("Searching no. found");
                return;
            }
        }
            System.out.println("Searching no. not found");
    }
}