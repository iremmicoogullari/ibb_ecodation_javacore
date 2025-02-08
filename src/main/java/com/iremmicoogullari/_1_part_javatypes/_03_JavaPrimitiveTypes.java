package com.iremmicoogullari._1_part_javatypes;

public class _03_JavaPrimitiveTypes {

    public static void main(String[] args) {

        //Primitive Types: 8 tanedir. null değer alamazlar.

        //Tam Sayılar (4): byte, short, int, long
        byte b1 = 127; // -128 <--> +127
        System.out.println("byte: " +b1);

        short s1 = 32767;
        System.out.println("short: " +s1);

        int i1 = 2147483647;
        System.out.println("int: " +i1);

        long l1 = 9223372036854775807L;
        System.out.println("long: " +l1);

        //Virgüllü Sayılar (floating point) (2): double and float

        float f2 = 3.14f;
        System.out.println("float: " + f2);

        double d2 = 3.14;
        System.out.println("double: " +d2);

        //boolean
        boolean b3 = true;
        System.out.println("boolean: " +b3);

        //char
        char c4 = 'k';
        System.out.println("char: " + c4);
    }
}
