import java.util.Scanner;

public class CapitizeFirst {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str = sc.nextLine();
        String result =  String.valueOf(str.charAt(0)).toUpperCase();
        for(int i = 2;i<str.length();i++){
            if(i<str.length()-1 && str.substring(i-1,i).equals(" ")){
                result =result + " "+ str.substring(i,i+1).toUpperCase();
                i+=1;
            }else{
                result =result +  str.substring(i-1,i);
            }
        }
        result += str.substring(str.length()-1);
        System.out.println(result);
    }
}
