package com.driver;
class A{
  String meth(){
    System.out.println("Invoking method from class A");
  }
}
class B extends A{
  String meth(){
    System.out.println("Method is overridden in Extendend class B");
  }
}
public class Main {
  A obj= new B();
  obj.meth();
}
