package com.yaya.basic;

public class BasicDataType {

    /**
     * Data types are divided into two groups:
     * Primitive data type: byte, short, int, long, float, double, boolean and char
     * Non-primitive data type: String, Arrays, Classes called reference types
     * <p>
     * Data Type	Size	Description
     * byte	        1 byte	Stores whole numbers from -128 to 127
     * short	    2 bytes	Stores whole numbers from -32,768 to 32,767
     * int	        4 bytes	Stores whole numbers from -2,147,483,648 to 2,147,483,647
     * long	        8 bytes	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
     * float	    4 bytes	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
     * double	    8 bytes	Stores fractional numbers. Sufficient for storing 15 decimal digits
     * boolean	    1 bit	Stores true or false values
     * char	        2 bytes	Stores a single character/letter or ASCII values
     * <p>
     * The main difference between primitive and non-primitive data types are:
     * <p>
     * Primitive types are predefined (already defined) in Java. Non-primitive types are created by the programmer and is not defined by Java (except for String).
     * Non-primitive types can be used to call methods to perform certain operations, while primitive types cannot.
     * A primitive type has always a value, while non-primitive types can be null.
     * A primitive type starts with a lowercase letter, while non-primitive types starts with an uppercase letter.
     * The size of a primitive type depends on the data type, while non-primitive types have all the same size.
     */

    int myNum = 5; //Integer (whole number)
    float myFloat = 5.99f; //Floating point number
    char myLetter = 'D'; //Character
    boolean myBool = true; //Boolean
    String myText = "Hello"; //String


    // Scientific Numbers
    public void scientificNumbers() {
        float f1 = 35e3f;
        double d1 = 12e4d;
        System.out.println(f1);
        System.out.println(d1);
    }

    // char ASCII values
    public void charAsciiValues() {
        char a = 65;
        char b = 66;
        char c = 67;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
