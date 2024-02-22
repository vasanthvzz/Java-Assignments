import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        System.out.println("enter the grade : ");
        Scanner sc = new Scanner(System.in);
        int mark = sc.nextInt();
        char grade = GradeFind(mark);
        System.out.println("The grade of the student is : "+grade);
    }

    static char GradeFind(int num){
    if(num >= 90){
        return 'A';
    }
    else if(num>=80){
        return 'B';
    }
    else if(num>=70){
        return 'C';
    }
    else if(num>=50){
        return 'D';
    }
    else{
        return 'F';
    }
    
}

}