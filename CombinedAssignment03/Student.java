package CombinedAssignment03;


public class Student {
    String name;
    int id;
    Student(String name , int id){
        this.name = name;
        this.id = id;
    }
    public static void main(String[] args) {
        Student zsgs = new Student("vasanth", 2);
        ZSGS zsgs2 = new ZSGS("vasanth",1);
    }
}

class ZSGS{
    int traineeId;
    ZSGS(String name , int id){
        super();
    }
    ZSGS(String name, int id , int traineeId){
        this(name,id);
        this.traineeId = traineeId;
    }
}
