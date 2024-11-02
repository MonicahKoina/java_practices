package Tracom.Functions;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        int sum3 = sum2();
        System.out.println(sum3);
    }
    //returning values
    static int sum2(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = input.nextInt();
        System.out.println("Enter the second number: ");
        int b = input.nextInt();
        int sum = a + b;
        return sum;
    }
//    static void sum(){
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the first number: ");
//        int a = input.nextInt();
//        System.out.println("Enter the second number: ");
//        int b = input.nextInt();
//        int sum = a + b;
//        System.out.println("The sum is: " + sum);
//    }
}
