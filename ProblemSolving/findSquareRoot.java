package ProblemSolving;

import java.util.Scanner;

public class findSquareRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        int result = 1;
        while(result<num){
            if(result* result == num){
                System.out.println("The result is : "+result);
                break;
            }
            if(result*result>num){
                int prev = (result-1)*(result-1);
                int temp = num-prev < result*result-num ? -1 : 0;
                System.out.println("The result is : "+(result+temp));
                break;
            }
            result+=1;
        }
    }
}
