import java.util.Arrays;
import java.util.Scanner;

public class RotationArray{

    public static void main(String[] args) {
        
        System.out.println("Enter the number of elements : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] input = new int[n];
        int[] result = new int[n];
        for(int i =0;i<n;i++){
            System.out.println("Enter for index "+i+"  :");
            int temp = sc.nextInt();
            input[i]=temp;
        }
        System.out.println("Enter the number of position : ");
        int position = sc.nextInt();
        for(int i = 0;i<n;i++){
            int temp = (i+position)%n;
            result[temp] = input[i]; 
        }
        System.out.println("After rotation :");
        System.out.println(Arrays.toString(result));
        
    }
}