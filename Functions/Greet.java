package Tracom.Functions;

public class Greet {
    public static void main(String[] args) {
        String message = greeting();
        System.out.println(message);
    }
    static String greeting(){
        String greeting = "Hello Java!";
        return greeting;
    }
}
