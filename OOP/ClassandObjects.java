package Tracom.OOP;

public class ClassandObjects {
    // Q:create a program that stores 5 roll numbers
//    int[] rollno = new int[5];
    //Q:Create a program that stores 5 data names
//    String[] names = new String[5];
    //Q:Create a single data structure that stores data for 5 students(data:Roll number, names and marks)
    /*
    solution: class-> a class is a named group of properties and methods
    If I want to combine properties like roll number, names and marks , I can achieve that using a class.
    A class can be used to create your own data type
     */
    static class Student {
        int rollno;
        String names;
        float marks;
    }

    public static void main(String[] args) {
        int[] rollno= new int[5];
        String[] names= new String[5];
        float[] marks= new float[5];
        Student Monicah;
        Monicah = new Student();
//        System.out.println(Monicah.rollno);//output=0
//        System.out.println(Monicah.names);//output = null
//        System.out.println(Monicah.marks);//output = 0.0


        //manipulate the object

        Monicah.rollno=13;
        Monicah.names="Monicah koina";
        Monicah.marks= 80.5f;
        System.out.println(Monicah.rollno);//Output 13

    }
}
