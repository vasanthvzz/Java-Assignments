import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str = sc.nextLine();
        String result =  "";
        int left = 0;
        int right;
        for(right = 0;right<str.length();right++){
            if(str.substring(right, right+1).equals(" ")){
                result = str.substring(left, right) + " " + result;
                left = right+1;
                right+=1;
            }
        }
        result = str.substring(left, right) + " " + result;
        System.out.println("After reversing : "+ result);
    }
}
