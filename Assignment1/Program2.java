import java.util.Scanner;

public class Program2 {

    public enum DAYS{
        SUNDAY , MONDAY , TUESDAY , WEDNESDAY , THURSDAY, FRIDAY , SATURDAY
    }
    public static void main(String[] args) {
        System.out.println("Enter the date");
        Scanner sc = new Scanner(System.in);
        int date = sc.nextInt();
        int day = date%7;
        switch(day){
            case 1: System.out.println(DAYS.SUNDAY);
            break;
            case 2: System.out.println(DAYS.MONDAY);
            break;
            case 3: System.out.println(DAYS.TUESDAY);
            break;
            case 4: System.out.println(DAYS.WEDNESDAY);
            break;
            case 5: System.out.println(DAYS.THURSDAY);
            break;
            case 6: System.out.println(DAYS.FRIDAY);
            break;
            case 7: System.out.println(DAYS.SATURDAY);
            break;
        }

    }
}
