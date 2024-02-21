import java.util.Scanner;

public class TimeConversion {
    public static void main(String[] args) {
        int second;
        System.out.println("Enter the seconds :");
        Scanner sc = new Scanner(System.in);
        second = sc.nextInt();
        int hour = getHour(second);
        second = second%3600;
        int minute = getMinute(second);
        second = second%60;
        System.out.printf("%02d : %02d : %02d",hour,minute,second);
    }

    static int getHour(int second){
        return second/3600;
    }
    static int getMinute(int second){
        return second/60;
    }
}
