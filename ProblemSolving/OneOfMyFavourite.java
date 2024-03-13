package ProblemSolving;

import java.util.Scanner;

public class OneOfMyFavourite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        while(num!=1){
            if(num%2==0){
                num = num/2;
            }else{
                num = 3*num +1;
            }
            System.out.println(num);
        }
    }
}
