package CombinedAssignment04;

public class Employee {
    String name;
    String employeeId;
    String email;
    public Employee(String employeeId,String name , String email){
        this.employeeId = employeeId;
        this.email = email;
        this.name = name;
    }
    public void getEmployeeDetails(){
        System.out.println("Id : "+employeeId);
        System.out.println("Name : "+name);
        System.out.println("Email : "+email);
    }
}

class HourlyEmployee extends Employee{
    double hourlyRate;
    int hoursWorked;
    public HourlyEmployee(String employeeId, String employeeName, String employeeEmail,double hourlyRate, int hoursWorked) {
        super(employeeId, employeeName, employeeEmail);
        this.hourlyRate=hourlyRate;
        this.hoursWorked=hoursWorked;
    }
    double getSalary(){
        return hourlyRate*hoursWorked;
    }
    public void getEmployeeDetails(){
        System.out.println("Id : "+employeeId);
        System.out.println("Name : "+name);
        System.out.println("Email : "+email);
        System.out.println("Salary : "+getSalary());
    }
}
class SalariedEmployee extends Employee{
    double salary;
    public SalariedEmployee(String employeeId, String employeeName, String employeeEmail,int salary) {
        super(employeeId, employeeName, employeeEmail);
        this.salary = salary;
    }
    public double getSalary(){
        return salary;
    }
    public void getEmployeeDetails(){
        System.out.println("Id : "+employeeId);
        System.out.println("Name : "+name);
        System.out.println("Email : "+email);
        System.out.println("Salary : "+getSalary());
    }

    public static void main(String[] args) {
        Employee employee1 = new HourlyEmployee("121", "vasanth", "vasanth@gmail", 24, 40);

        Employee employee2 = new SalariedEmployee("131", "Saran", "saran@gmail",30000);
        employee1.getEmployeeDetails();
        employee2.getEmployeeDetails();
    }
    
    
}