import java.util.Scanner;

public class BitwiseOperation {
    public static void main(String[] args) {
        int a , b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number :");
        a = sc.nextInt();
        System.out.println("Enter the Second number :");
        b = sc.nextInt();
        binaryPrint(a);
        binaryPrint(b);
        System.out.println("Output after AND operation");
        System.out.println(a&b);
        binaryPrint(a&b);
        System.out.println("Output after OR operation");
        binaryPrint(a|b);
        System.out.println(a|b);
        System.out.println("Output after XOR operation");
        System.out.println(a^b);
        System.out.println("Output after left shift operation");
        System.out.println(a<<1);
        System.out.println("Output after right shift operation");
        System.out.println(a>>1);

    }

    static void binaryPrint(int n){
        System.out.println(Integer.toBinaryString(n));
    }
}
