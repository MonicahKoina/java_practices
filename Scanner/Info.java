package Tracom.Scanner;

import java.util.Scanner;

public class Info {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name and age: ");
        String name = input.nextLine();
        int age = input.nextInt();
        System.out.println("Your name is " + name + " and you are of age " + age);

    }
}
