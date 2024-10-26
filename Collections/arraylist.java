package Tracom.Collections;

import java.util.ArrayList;
import java.util.List;

public class arraylist {
    public static void main(String[] args) {
        List<String> food = new ArrayList<>();
        food.add("pizza");
        food.add("Shawarma");
        food.add("fries");
        System.out.println(food);//output [pizza, Shawarma, fries]
    }
}
