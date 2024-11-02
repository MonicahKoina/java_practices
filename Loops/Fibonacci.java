package Tracom.Loops;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        //Find the nth fibonacci number
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;
        while (count <= n){
            int temp = b;
            b += a;
            a = temp;
            count++;

        }
        System.out.println(b);//input 7 .  output 13
    }
}
