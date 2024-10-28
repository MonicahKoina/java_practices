package Tracom.Recursion;

public class Finite {
    static int count = 0;
    static void m(){
        count++;
        if(count<=5){
            System.out.println("Hello " + count);
            m();
        }
    }

    public static void main(String[] args) {
        m();
    }
}
