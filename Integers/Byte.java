package Tracom.Integers;

public class Byte {
    //a byte is a type used with integers
    //all numbers in the interval [-128, 128] can be stored in a byte variable
    public static void main(String[] args) {
        //byte b1 = 129; error (129 is beyond the range of a byte variable)
        byte b1 = 127;
        byte b2 = 100;
        System.out.println(b1+b2); //output 227
    }
}
