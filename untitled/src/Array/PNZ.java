package Array;
// count positive, negative and zero elements.
import java.util.Scanner;
public class PNZ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Array Length: ");
        int L = sc.nextInt();
        int[] arr = new int[L];
        System.out.println("Array Element: ");
        for (int i = 0; i <= L - 1; i++) {
            arr[i] = sc.nextInt();
        }
        int poision = 0;
        int peace = 0;
        int valuable = 0;
        for (int i =0;i <= L- 1; i++){
            if(arr[i]>0){
                poision++ ;
            }
            if(arr[i]<0){
                peace++ ;
            }
            if(arr[i]==0){
                valuable++ ;
            }
        }
        System.out.println("positive " + poision );
        System.out.println("negative " + peace );
        System.out.println("zero " + valuable );
    }
}
