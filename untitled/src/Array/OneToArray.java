package Array;
// copy elements from one array to another and print the second array in reverse order.
import java.util.Scanner;
public class OneToArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Array Length: ");
        int L = sc.nextInt();
        int[] arr = new int[L];
        System.out.println("Array Element: ");
        for (int i = 0; i <= L - 1; i++) {
            arr[i] = sc.nextInt();
        }
        int [] goku = arr;
        for (int i = L -1; i>=0; i--){
            System.out.println ( goku[i]);
        }
    }
}
