package Array;

public class LastOccurrence {
    public static void main(String[] args){
        int[] arr ={2,4,6,4,8,4};
        int taara = 4;
        int index = -1;
        for (int i= arr.length -1; i>= 0; i--){
            if (arr [i] == taara){
                index= i;
                break;
            }
        }
        if (index != -1){
            System.out.println("Last occurrence index: " + index );
        } else{
            System.out.println("Element not found " );
        }
    }
}
