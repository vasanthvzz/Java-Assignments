package CombinedAssignment01;

import java.util.Scanner;

//This program consist of the code for both task 3 and task 4

public class Person {
    private String name;
    private float height;
    private float weight;
    public float bmi;
    private String remark;
    Scanner sc = new Scanner(System.in);
    Person(){
        System.out.print("Enter the name of the person : ");
        this.name = sc.next();
        System.out.println("Enter the height of the person(in cm) : ");
        this.height = sc.nextFloat();
        System.out.println("Enter the weight of the person(in kg) : ");
        this.weight = sc.nextFloat();
        this.bmi = setBMI(height, weight);
        setRemark(this.bmi);
    }
    private float setBMI(float height,float weight){
        height = height/100;
        float bmi = weight/(height*height);
        return bmi;
    }

    private void setRemark(float bmi){
        if(bmi<18.5){
            this.remark = "Underweight"; 
        }else if(bmi<=24.9){
            this.remark = "Healthy";
        }else if(bmi<30){
            this.remark = "Overweight";
        }else{
            this.remark = "Obese";
        }
    }

    public String getDetails(){
    
        String result = String.format("%s  |  %.2f  |  %s", this.name,this.bmi,this.remark);
        return result;
    }
    public float getBmi() {
        return this.bmi;
    }
}
