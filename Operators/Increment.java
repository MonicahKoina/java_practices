package Tracom.Operators;

public class Increment {
    /*
    Increment increases the value of a variable by one
    post-increment(i++)-uses the original value in the statement
    pre-increment(++i)-uses the new value of the statement
     */

    public static void main(String[] args) {
        int i = 5;
        int j = i++;
        System.out.println("The value of i is " + i + " and the value of j is " + j);//The value of i is 6 and the value of j is 5
    }
}
