package com.main;

import com.foo.Calc;

public class App{
  public static void main(String [] args){
    System.out.println("Hello World, what else");
    Calc c = new Calc(12,23);
    System.out.println("Sum = " + c.add());
  }
}
