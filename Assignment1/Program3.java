import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        System.out.println("Enter a number :");
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        System.out.println(randomGenerator(start,end));
    }
    public static int randomGenerator(int min, int max){
        int result;
        result = (int) (max*Math.random());
        result+=min;
        return result;
    }
}
