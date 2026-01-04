import java.util.Scanner;

public class Looparray {
    public static void main(String[] args) {
        //   int [] marks = {100, 84,78,46,96};
        //    System.out.println(marks.length);
        //   for (int i=0;i<marks.length;i++){
        //      System.out.println(marks[i]);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array elements are: ");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
