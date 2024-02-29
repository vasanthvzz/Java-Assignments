import java.util.Arrays;
import java.util.Scanner;

public class TransposeMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int row = sc.nextInt();
        System.out.println("Enter the number of columns : ");
        int column = sc.nextInt();
        int[][] input = new int[row][column];
        int[][] result = new int[row][column];
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                int temp = sc.nextInt();
                input[i][j] = temp;
                result[j][i] = temp;
            }
        }
        System.out.println("Before Transpose : ");
        for(int i =0;i<row;i++){
            System.out.println(Arrays.toString(input[i]));
        }
        System.out.println("After Transpose : ");
        for(int i =0;i<row;i++){
            System.out.println(Arrays.toString(result[i]));
        }

    }

}
