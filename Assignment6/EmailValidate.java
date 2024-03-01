import java.util.Scanner;

public class EmailValidate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str = sc.nextLine();
        int atCheck = 0;
        boolean endWith = false;
        for(int i = 0;i<str.length();i++){
            if(str.charAt(i) == '@'){
                atCheck +=1;
            }
        }
        endWith = str.endsWith(".com") ||str.endsWith(".in") || str.endsWith(".org");
        if(endWith && atCheck == 1){
            System.out.println("valid email");
        }else{
            System.out.println("Invalid Email");
        }
    }
}
