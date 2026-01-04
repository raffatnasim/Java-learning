import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int OrignalNum = num;
        int result = 0;
        while (num != 0) {
            int re = num % 10;
            int power = re * re * re;
            result = result + power;
            num = num / 10;
        }
                  if  (result == OrignalNum){
                System.out.println("is an Armstrong Number");

            }
            else{
                System.out.println("is not an Armstrong Number");
            }
        }
}

