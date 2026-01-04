package Array;
// find the sum of all elements in an array
public class SumArray {
    public static void main(String[] args) {
        int [] arr ={95,40,11,88,98,21};
        int abs = 0;
        for(int i= 0; i<arr.length; i++){
            abs += arr[i];
        }
        System.out.println("sum of all elements: " + abs);
    }
}
