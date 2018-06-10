package com.yaohuijin.java.designpattern.factorypattern.javabase;

public class OprationCharactorTest {
    //前缀自增自减法(++i,--i): 先进行自增或者自减运算，再进行表达式运算。
    //后缀自增自减法(i++,i--): 先进行表达式运算，再进行自增或者自减运算
    public static void main(String args[]) {
        int a = 5;
        int b = 3;
        int c = 3;
        int d = 3;
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));
        //5
        System.out.println("a++ = " + (a++));
        //7
        System.out.println("++a = " + (++a));
        //3
        System.out.println("b-- = " + (b--));
        //1
        System.out.println("--b = " + (--b));
        //3
        System.out.println("c++ = " + (c++));
        //4
        System.out.println("++d = " + (++d));
    }
}
