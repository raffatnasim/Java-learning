package Array;

public class BubbleShort {
    public static void main (String[] args ) {
        int[] arr = {7, 3, 4, 1, 6, 2, 5};
        int n = arr.length;
        for (int k = 0; k < n -1; k++) {
            for (int i = 0, j = 1; i < n - 1 - k; i++, j++) {
                if (arr[i] > arr[j]) {
                    int dimaagkharab = arr[i];
                    arr[i] = arr[j];
                    arr[j] = dimaagkharab;
                }
            }
        }
        System.out.println("Sorted Array ");
        for (int i = 0; i < n; i++) {
        System.out.print ( arr[i] + " ");
        }
    }
}
