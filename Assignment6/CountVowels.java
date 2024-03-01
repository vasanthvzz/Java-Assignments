import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class CountVowels{
    public static void main(String[] args) {
        HashSet<Character> vowels = new HashSet<>(Arrays.asList('a','e','i','o','u'));
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str = sc.next();
        str = str.toLowerCase();
        int count = 0;
        for(int i=0;i<str.length();i++){
            if(vowels.contains(str.charAt(i))){
                count+=1;
            }
        }
        System.out.println("The number of vowel is the string is : "+count);
    }
}