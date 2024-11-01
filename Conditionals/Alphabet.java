package Tracom.Conditionals;

import java.util.Scanner;

public class Alphabet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char character = input.next().trim().charAt(0);
        if(character>='a' && character<='z') {
            System.out.println("lowercase");
        }else {
            System.out.println("Uppercase");
        }//input=Hello . output=Uppercase
    }
}
