import java.util.Arrays;
import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        int[][] m1 = getMatrix();
        int[][] m2 = getMatrix();
        int rowA = m1.length;
        int rowB = m2.length;
        int colA = m1[0].length;
        int colB = m2[0].length;
        if(colA!= rowB){
            System.out.println("Matrix cannot be multiplied");
            return;
        }


        int[][] result= new int[rowA][colB];
        for(int i=0;i<rowA;i++){
            for(int j=0;j<colB;j++){
                for(int k=0;k<colA;k++){
                    result[i][j]+= m1[i][k]*m2[k][j];
                }
            }
        }
        printMatrix(result);

    }

    static void printMatrix(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            System.out.println(Arrays.toString(matrix[i]));
        }
    }

    static int[][] getMatrix(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int row = sc.nextInt();
        System.out.println("Enter the number of columns : ");
        int column = sc.nextInt();
        int[][] m1 = new int[row][column];
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                m1[i][j] = sc.nextInt();
            }
        }
        return m1;
    } 

}
