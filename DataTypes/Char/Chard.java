package Tracom.DataTypes.Char;

public class Chard {
    //Computers see characters as binary numbers
    //each character is encoded then stored in  memory
    //encoding is mapping each character into its binary representation with the help of encoding scheme
    //java uses the Unicode  encoding scheme
    //The char data type is used with characters and each character is put inside single quotes
    public static void main(String[] args) {
        char grade ='A';
        int grade1 ='A';
        System.out.println(grade);
        System.out.println(grade1);//output 65 (65 is the integer representation os the character A
    }
}
