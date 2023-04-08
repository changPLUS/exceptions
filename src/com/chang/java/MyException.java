package com.chang.java;
/*
* 如何自定义异常类？
* 1.继承于现有的异常结构，RuntimeException Exception
* 2.提供全局变量 serialVersionUID
* 3.提供重载的构造器
* */
//public class MyException extends RuntimeException {
//    static final long serialVersionUID = -3387516993124229949L;
//
//    public MyException() {
//    }
//
//    public MyException(String message) {
//        super(message);
//    }
//}
public class MyException extends Exception {
    static final long serialVersionUID = -3387516993124229949L;

    public MyException() {
    }

    public MyException(String message) {
        super(message);
    }
}