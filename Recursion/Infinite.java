package Tracom.Recursion;

public class Infinite {
    //recursion is a process in which a method calls itself
    static void p(){
        System.out.println("Hello World");
        p();
    }
    public static void main(String[] args) {
        p();
    }
}
