package CombinedAssignment01;

import java.util.Scanner;

public class Progam1 {
    public static void main(String[] args) {
        int[] weightsOfPersons = new int[10];
        int sumOfWeights = 0;
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<10;i++){
            System.out.print("Enter the weight of person "+(i+1)+" : ");
            weightsOfPersons[i] = sc.nextInt();
            sumOfWeights+=weightsOfPersons[i];
        }
        double averageOfWeights = sumOfWeights/10.0;
        System.out.println("The average weight is "+averageOfWeights); 
    }
}
