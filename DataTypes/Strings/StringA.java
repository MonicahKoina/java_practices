package Tracom.DataTypes.Strings;

public class StringA {
    //A string is a class
    //It contains static methods
    //String object -> Variable of type string, also have some methods
    public static void main(String[] args) {
        String greet = "Hello, i am a human being";
        String greet2 = greet.toUpperCase();
        System.out.println(greet2);//output HELLO, I AM A HUMAN BEING(A new string is created, the original one is not modified
    }
}
