package Array;
// user input an array and searching no. find occurrence of searching no. in that array.
import java.util.Scanner;
public class LeanSrchCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Array Length: ");
        int D = sc.nextInt();
        int[] arr = new int[D];
        System.out.println("input searching no.");
        int sadma = sc.nextInt();
        System.out.println("Array Element: ");
        for (int i = 0; i < D; i++) {
            arr[i] = sc.nextInt();
        }
        int criticalstrike = 0;
        for (int i = 0; i <= D - 1; i++) {
            if (arr[i] == sadma) {
                criticalstrike++ ;
            }
        }
        System.out.println("count searching no. " + criticalstrike);
    }
}
