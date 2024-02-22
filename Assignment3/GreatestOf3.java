import java.util.Scanner;

public class GreatestOf3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a , b , c , result;
        System.out.println("Enter the first number : ");
        a = sc.nextInt();
        System.out.println("Enter the second number : ");
        b = sc.nextInt();
        System.out.println("Enter the third number : ");
        c = sc.nextInt();
        result = a>b ? a : b;
        result = result>c ? result : c;
        System.out.println(result);
    }
}
