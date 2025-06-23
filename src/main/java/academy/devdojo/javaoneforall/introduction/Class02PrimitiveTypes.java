package academy.devdojo.javaoneforall.introduction;

public class Class02PrimitiveTypes {
    public static void main(String[] args){
        // int, double, float, boolean, char, byte, short, long
        // cast
        int age = (int) 10000000000L;
        long bigNumber = (long) 135.43D;
        float salaryFloat = (float) 2500.0D;
        double salaryDouble = 5000.0D;
        boolean trueValue = true;
        boolean falseValue = false;
        short ageShort = 29;
        byte ageByte = -128;
        char character = 'W';
        char characterAscii = '\u0040';
        System.out.println("The age is "+age+" years old");
    }
}
