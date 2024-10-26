package Tracom.Collections;


import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class linked {
    public static void main(String[] args) {
       List<Integer> population = new LinkedList<>();
       population.add(7379);
       population.add(4556);
       population.add(5676);
        Collections.sort(population);
        for(int p: population) {
            System.out.println(p);
        }
    }
}
