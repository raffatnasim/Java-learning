package Array;
// Insert an element at a given index
import java.util.Scanner;
public class InsertElement {
    public static void main(String[] args) {
        int [] sanki ={67,31,25,12,98};
        Scanner sc = new Scanner (System.in);
        System.out.println("index no.");
        int dramatic = sc.nextInt();
        System.out.println("Which element insert at given index");
        int insane = sc.nextInt();
        int [] arr = new int[sanki.length+1];
        for(int i=0; i<sanki.length; i++){
           arr[i] = sanki[i];
        }
        for(int i=arr.length-1; i>dramatic; i--){
            arr[i]= arr[i-1];
        }
        arr[dramatic] = insane;
        System.out.println("output new array");
        for(int i=0; i<arr.length;i++){
            System.out.print(arr [i] + " ");
        }
    }
}
