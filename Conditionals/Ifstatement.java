package Tracom.Conditionals;

public class Ifstatement {
    public static void main(String[] args) {
        int salary = 26000;
        if(salary >= 10000) {
            salary += 4000;
        } else if(salary >= 20000) {
            salary += 7000;
        }else {
            salary += 1000;
        }
        System.out.println(salary);
//        }else{
//            salary += 1000;
//        }
//        System.out.println(salary);
    }
}
