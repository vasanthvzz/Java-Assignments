package CombinedAssignment01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Program3 {
    static ArrayList<Person>personList = new ArrayList();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of persons : ");
        int num = sc.nextInt();
        while(num-- > 0){
            Person p1 = new Person();
            personList.add(p1);
        }
         Collections.sort(personList, Comparator.comparingDouble(Person::getBmi));

        System.out.println("Name |  BMI  |  Remark");
        for(Person p : personList){
            System.out.println(p.getDetails());
        }
    }
}
