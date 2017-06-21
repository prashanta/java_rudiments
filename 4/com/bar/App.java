package com.bar;

import com.foo.Calc;

public class App{
  public static void main(String [] args){
    Calc c = new Calc(12,23);
    System.out.println("Sum = " + c.add());
  }
}
