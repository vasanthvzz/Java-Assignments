import java.util.Scanner;

public class BodyMass {
    static float index;
    public static void main(String[] args) {
        float weight , height ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your weight :");
        weight = sc.nextFloat();
        System.out.println("Enter your height :");
        height = sc.nextFloat()/100;
        bodyIndexCalc(weight, height);
        System.out.println("The body index of the person is : "+index);
        sc.close();
    }

    static void bodyIndexCalc(float weight,float height){
        index =  weight /(height*height) ;
    }
}
