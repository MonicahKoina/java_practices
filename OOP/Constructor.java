package Tracom.OOP;

public class Constructor {
    public static void main(String[] args) {
        int[] rollno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

        Student1 student1 = new Student1(13, "Monicah koina", 89.9f);
        System.out.println(student1.rollno);
        System.out.println(student1.name);
        System.out.println(student1.marks);


//        student1.greeting();//output Hello! my name is Monicah mugure
//        System.out.println(student1.name);
//        System.out.println(student1.marks);
//        System.out.println(student1.rollno);

    }
}
class Student1{
    int rollno;
    String name;
    float marks;

    void greeting(){
        System.out.println("Hello! my name is " + name);
    }
    //to access every object we use this keyword
//    Student1(){
//        this.rollno = 13;
//        this.name = "Monicah mugure";
//        this.marks = 89.8f;
//    }
    Student1(int rollno, String name, float marks){
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;

    }
}
