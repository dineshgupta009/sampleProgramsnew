package com.samplePrograms.oopsConecpt;

public class method {

//    Normal Method
    public void helloMethod(){
         System.out.println("This is hello Method");
    }

//    static Method
    static void staticMethod(){
        System.out.println("This is static method ");
    }

    public static void main(String[] args) {

        method m=new method();
        m.helloMethod();
        method.staticMethod();
    }
}
