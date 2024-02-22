import java.util.Scanner;

public class MultiplicationtTable {

    public static void main(String[] args) {
        int n ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        n = sc.nextInt();
        printTable(n);

    }
    static void printTable(int n){
        for(int i = 1;i<=10;i++){
            System.out.println(i+"X"+n+"="+i*n);
        }
    }
    
}