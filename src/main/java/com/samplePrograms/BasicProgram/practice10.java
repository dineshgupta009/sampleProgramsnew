package com.samplePrograms.BasicProgram;

public class practice10 {

        static int i = 1;

        static
        {
            i = i-- + --i;
        }

        {
            i = i++ - ++i;
        }

        int methodOfTest()
        {
            return i + i - i * i / i;
        }



    public static void main(String[] args) {
        System.out.println(new practice10().methodOfTest());
    }
}
