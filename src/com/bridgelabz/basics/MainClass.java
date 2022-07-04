package com.bridgelabz.basics;

public class MainClass {

    // variables , data types , methods or functions, operators , keywords, Loops , statements
    // Data structures, Object , class , Interface , Abstraction , OOP's concepts.

    // Data types => Primitive and Non-Primitive
    // Primitive Data types => byte, short ,int ,long ,float ,double ,boolean ,char
    // Non-Primitive Data types => Class,Interface,Arrays,Enum
    // machine understands machine readable code

    public static void main(String[] args) {
        byte v = -128;  // 1 byte    // 0   // -128 to 127
        short s = 2; // 2 byte    // 0
        int i = 2147483647;  // 4 byte    // 0
        long l = 2147483648L; // 8 byte    // 0
        float f = 21474835666.54123f; // 4 byte   // 0.0f
        double d= 2012.54123234545; // 8 byte   // 0.0
        boolean b = true; // 1 bit  // false
        char c = '3'; // 2 byte   // \u0000
        System.out.println((int)'b');  // type casting
        System.out.println((int)c);
        System.out.println(f);
        System.out.println(d);
        System.out.println("Long =>" +(long) f);

        int variable = 1009999;
        float f2 = variable;
        System.out.println(f2);

//        byte	1 byte	Stores whole numbers from -128 to 127
//        short	2 bytes	Stores whole numbers from -32,768 to 32,767
//        int	4 bytes	Stores whole numbers from -2,147,483,648 to 2,147,483,647
//        long	8 bytes	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
//        float	4 bytes	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
//        double	8 bytes	Stores fractional numbers. Sufficient for storing 15 decimal digits
//        boolean	1 bit	Stores true or false values
//        char	2 bytes	Stores a single character/letter or ASCII values

        System.out.println("Hello world");
    }



}
