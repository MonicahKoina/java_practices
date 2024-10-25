package Collections;


import java.util.LinkedList;
import java.util.List;

public class linked {
    public static void main(String[] args) {
       List<String> students = new LinkedList<>();
       students.add("Monicah");
       students.add("Kevin");
       students.add("Michael");
       System.out.println(students.size());//output 3(returns number of elements)
    }
}
