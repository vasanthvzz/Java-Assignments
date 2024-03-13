package ProblemSolving;
import java.util.Scanner;

public class trainOfCharacter {
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Enter a string with odd number length : ");
            str = sc.nextLine();
        }while(str.length()%2==0);
        int count = str.length()/2+1;
        String result = "";
        boolean flag =false;
        for(int i=0;i<str.length();i++){
            if(count == 1){
                flag = true;
            }
            
            result += str.substring(i,i+1).repeat(count);
            if(flag){
                count++;
            }else{
                count--;
            }
        }
        System.out.println(result);

    }
}
