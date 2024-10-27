package Tracom.DataTypes.Integers;

public class Long {
    //All numbers in the interval [-9223372036854775808, 9223372036854775807](64bits) can be stored in a long variable
   //a long can store byte, int and short
    public static void main(String[] args) {
       byte b2 = 127;
       short s2 = 7899;
       int i1 = 7889;
       long l2 = 8988990000L;
        System.out.println(b2+s2+i1+ l2);
    }
}
