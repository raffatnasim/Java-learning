package Array;

//input an array from console. print that array using recursion.
import java.util.Scanner;
public class Printarray {
    public static void printArr(int []arr, int index){
        if(index == arr.length){
            return;
        }
        System.out.println(arr[index]);
        printArr(arr, index+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Array Length: ");
        int j = sc.nextInt();
        int [] arr = new int[j];
        System.out.println("Array Element: ");
        for(int i=0; i <=j-1; i++){
            arr [i] = sc.nextInt();
        }
        printArr(arr,0);
    }
}
