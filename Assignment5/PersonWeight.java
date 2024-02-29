import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PersonWeight {
    static ArrayList<ArrayList<Integer>> weights = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.println(weights.size());
        
        System.out.println("Enter the number of persons : ");
        int num = sc.nextInt();
        for(int i = 0;i<num;i++){
            weights.add(new ArrayList<Integer>());
        }
        AddWeight();
        AddWeight();
        AddWeight();
        AddWeight();
        AddWeight();
        getSmallest();
        printArray();
    }
    static void AddWeight(){
        System.out.println("Enter the index of the member : ");
        int index = sc.nextInt();
        if(index>=weights.size()){
            System.out.println("User not found");
            return ;
        }
        System.out.println("Enter the weight of the member : ");
        int weight = sc.nextInt();
        weights.get(index).add(weight);
        return ;
    }

    static void getSmallest(){
        System.out.println("Enter the index of the member : ");
        int index = sc.nextInt();
        if(index>=weights.size()){
            System.out.println("User not found");
            return ;
        }
        ArrayList <Integer> personWeight = new ArrayList<>(weights.get(index));
        int min = weights.get(index).get(0);
        for(int i=0;i<personWeight.size();i++){
            if(personWeight.get(i)<min){
                min = personWeight.get(i);
            }
        }
        System.out.println(min);
    }

    static void printArray(){
        for(int i=0;i<weights.size();i++){
            System.out.println(weights.get(i));
        }
    }
}
