// package CombinedAssignment01;

// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.Scanner;

// public class temp {
//     static ArrayList<Float> bmiArray = new ArrayList<>();
//     static Scanner sc = new Scanner(System.in);
//     public static void main(String[] args) {
        
//         System.out.println("Enter the number of persons : ");
//         int num = sc.nextInt();
//         while(num-- >0){
//             getInput();
//         }
//         Float[] floatArray = bmiArray.toArray(new Float[0]);
//         System.out.println(Arrays.toString(floatArray));
//     }
//     public static void getInput(){
//         float weight , height;
//         System.out.println("Enter the weight of the person");
//         weight = sc.nextFloat();
//         System.out.println("Enter the height of the person");
//         height = sc.nextFloat();
//         bmiCalc(height/100,weight);
//     }
//     public static void bmiCalc(float height,float weight){
//         float index =  weight /(height*height) ;
//         bmiArray.add(index);
//     }
// }
