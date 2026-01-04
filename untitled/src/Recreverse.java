import java.util.Scanner;
// user input in array and print reverse using recursion

public class Recreverse {
    public static void Mai(int[] arr, int L, int index) {
        if(L==index){
            return;
        }
        System.out.println(arr [L-1]);
        Mai(arr, L-1, index);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Array Length: ");
        int L = sc.nextInt();
        int[] arr = new int[L];
        System.out.println("Array Element: ");
        for (int i = 0; i <= L-1; i++) {
            arr[i] = sc.nextInt();
        }
        Mai(arr, L, 0);
    }
}