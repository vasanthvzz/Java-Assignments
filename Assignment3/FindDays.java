import java.util.Scanner;

public class FindDays {
    public static void main(String[] args) {
        int days = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year : ");
        int year = sc.nextInt();
        System.out.println("Enter the month: ");
        int month = sc.nextInt();
        switch(month){
            case 1,3,5,7,8,10,12 : {
                days = 31;
                break;
            }
            case 2 : {
                days = 28+isLeap(year);
                break;
            }
            default:{
                days = 30;
            }
        }
        System.out.println("The number of days is  : "+days);

    }
    static int isLeap(int year){
        if(year%4==0){
            if(year%100==0 && year%400!=0){
                return 0;
            }else{
                return 1;
            }
        }else{
            return 0;
        }
    }
}
