package com.bridgelabz.generics;

public class TestMaximum <T extends Comparable<T>> {

    //Creating 3 variables.
    T x, y, z ,c;

    //Creating Parameterized constructor for generic data types.
    public TestMaximum(T x, T y, T z ,T c) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.c = c;

    }

  
    public T maximum()
    {
        return TestMaximum.maximum(x, y, z, c);
    }

    // determines the largest of three Comparable objects
    public static <T extends Comparable<T>> T maximum(T x, T y, T z,T c)
    {
        T max = x; // assume x is initially the largest

        if (y.compareTo(max) > 0)
        {
            max = y; // y is the largest so far
        }
        if (z.compareTo(max) > 0)
        {
            max = z; // is the largest now
        }
        if (c.compareTo(max) > 0)
        {
            max = c; // is the largest now
        }
        printMax(x, y, z,c, max);
        return max; // returns the largest object
    }

    public static <T> void printMax(T x, T y, T z,T c,T max)
    {
        System.out.printf("Max of %s, %s ,%s and %s is %s\n", x, y, z,c, max);
    }

    public static void main(String[] args) {
        
        //Define the array where size is 3(given).
        Integer xInt = 5, yInt = 6, zInt = 7,cInt=8;
        Float xFlt = 5.5f, yFlt = 4.5f, zFlt = 3.5f,cFlt = 3.8f;
        String xStr = "Apple", yStr = "Peach", zStr = "Banana",cStr = "Peanut";

        new TestMaximum(xInt, yInt, zInt,cInt).maximum();
        new TestMaximum(xFlt, yFlt, zFlt,cFlt).maximum();
        new TestMaximum(xStr, yStr, zStr,cStr).maximum();
    }
}
