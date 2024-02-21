import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number :");
        int a = sc.nextInt();
        System.out.println("Enter second number ");
        int b = sc.nextInt();
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Value of a is "+a);
        System.out.println("Value of b is "+b);
    }

}
