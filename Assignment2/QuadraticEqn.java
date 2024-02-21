import java.util.Scanner;

public class QuadraticEqn {
    
    public static void main(String[] args) {
        int a , b , c ;
        double val1 , val2 ,disc;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a : ");
        a = sc.nextInt();
        System.out.println("Enter b : ");
        b = sc.nextInt();
        System.out.println("Enter c : ");
        c = sc.nextInt();
        
        disc = b*b - (4*a*c);
        
        if(disc < 0){
            System.out.println("The equation has no roots");
        }else{
            val1 = (-b+Math.sqrt(disc))/(2*a);
            val2 = (-b-Math.sqrt(disc))/(2*a);
            System.out.println("Root 1 "  + val1);
            System.out.println("Root 2 "  + val2);
        }
        
}
}

