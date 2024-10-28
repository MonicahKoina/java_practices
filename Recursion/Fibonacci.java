package Tracom.Recursion;

public class Fibonacci {
    //fibonacci is a sequence in which each number is the sum of two prepending ones
    //o,1,1,2,3,5
    static int factorial(int n) {
        if (n==0 || n==1){
            return 1;
        }else {
            return (n*factorial(n-1));
        }
    }

    public static void main(String[] args) {
        System.out.println(factorial(3));
    }
}
