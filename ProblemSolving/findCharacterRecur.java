package ProblemSolving;

public class findCharacterRecur {
    public static void main(String[] args) {

        System.out.println(recur("hello",'h'));
        System.out.println(recur("Tharun", 'h'));
        System.out.println(recur("Yellow", 'u'));
        System.out.println(recur("Tower", 'W'));

    }
    public static boolean recur(String str, char c){
        if(str.length()==0){
            return false;
        }
        if(str.charAt(0)==c){
            return true;
        }
        return recur(str.substring(1), c);
    }
}
