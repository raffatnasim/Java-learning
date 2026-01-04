package Array;
// find the average of array elements
public class AvgArray {
    public static void main(String[] args) {
        int [] arr ={95,40,11,88,98,21};
        int biseps = 0;
        for(int i= 0; i<arr.length; i++){
            biseps += arr[i];
        }
        int avg = biseps / arr.length;
        System.out.println("Avrage of elements: " + avg);
    }
}
