package Array;
// find the minimum elements

import java.util.Scanner;
public class MiniArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Array Length: ");
        int A = sc.nextInt();
        int[] arr = new int[A];
        System.out.println("Array Element: ");
        for (int i = 0; i <= A - 1; i++) {
            arr[i] = sc.nextInt();
        }
        int mini = arr[0] ;
        for (int i =1;i <=A - 1; i++){
            if(mini > arr[i]){
                mini = arr[i];
            }
        }
        System.out.println("minimum "+ mini);
    }
}
