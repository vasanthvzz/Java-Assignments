import java.util.Scanner;

public class Temperature{
    static float celcius , fahrenheit;
    public static void main(String[] args) {
        System.out.println("Enter the value of celcius : ");
        Scanner sc = new Scanner(System.in);
        float celcius = sc.nextFloat();
        convert(celcius);
        System.out.println(fahrenheit);
        sc.close();
    }

    static void convert(float celcius){
        fahrenheit = (celcius * 9/5) + 32;
    }
}