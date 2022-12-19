package com.driver;

class A{
    static String meth(){
        return "Invoking method from class A";
    }
}
class B extends A{
    static String meth(){
        return "Method is overridden in Extendend class B";
    }
}
public class Main {
    public static void main(String[] args)
    {
        A obj= new B();
        System.out.println(obj.meth());
    }
}