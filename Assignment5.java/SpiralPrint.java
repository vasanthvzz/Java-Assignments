import java.util.Arrays;
import java.util.Scanner;

public class SpiralPrint {
    public static void main(String[] args) {
        System.out.println("Enter the size of matrix : " );
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        int num = 1;
        int r = 0 , c = 0 , rmin = 0 , cmin = 0;
        int rmax = n , cmax = n;
        while(num<=n*n){
            while(num<n*n && c<cmax){
                matrix[r][c] = num;
                c+=1;
                num+=1;
            }
            c-=1;
            rmin+=1;
            r+=1;

            while(num<=n*n && r<rmax){
                matrix[r][c] = num;
                r+=1;
                num+=1;
            }
            r-=1;
            cmax-=1;
            c-=1;

            while(num<=n*n && c>=cmin){
                matrix[r][c] = num;
                c-=1;
                num+=1;
            }
            c+=1;
            rmax-=1;
            r-=1;

            while(num<=n*n && r>=rmin){
                matrix[r][c] = num;
                r-=1;
                num+=1;
            }
            r+=1;
            cmin+=1;
            c+=1;

        }
        for(int i= 0;i<matrix.length;i++){
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
}
