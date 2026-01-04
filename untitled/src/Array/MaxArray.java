package Array;
// find the maximum elements
import java.util.Scanner;

public class MaxArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Array Length: ");
        int A = sc.nextInt();
        int[] arr = new int[A];
        System.out.println("Array Element: ");
        for (int i = 0; i <= A - 1; i++) {
            arr[i] = sc.nextInt();
        }
        int max = 0;
        for (int i =0;i <=A - 1; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println("maximum "+ max );
    }
}
