package com.chang.java;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
/*
* 1."throws + 异常类型"写在方法的声明处，指明此方法执行时，可能会抛出的异常类型
* 一旦当方法体执行时，出现异常，仍会在异常代码处生成一个异常类的对象，此对象满足throws后异常类型时，
* 就会被抛出，异常代码后续的代码，就不再执行！
* 2. 体会 try-catch-finally:真正的将异常给处理掉了。
* throws的方式只是将异常抛给了方法的调用者，并没有真正将异常处理掉
* 3.开发中如何选择使用try-catch-finally还是使用throws?
*   3.1 如果父类中被重写的方法没有throws方法处理异常，则子类重写的方法也不能使用throws，意味这如果
*   子类重新的方法中有异常，必须使用try-catch-finally方式处理
*   3.2 执行的方法A中，先后又调用了另外的几个方法，这几个方法是递进关系执行的，我们建议这几个方法使用throws的方法
*   进行处理。而执行的方法A可以考虑使用try-catch-finally方式进行处理
* */
public class ExceptionTest2 {

    public static void main(String[] args) {
        try {
            test2();
        }catch (FileNotFoundException e){
            System.out.println("!1111");
        } catch (IOException e){
            System.out.println("222221");
        }
        //test3();java.io.FileNotFoundException: hello1.txt (系统找不到指定的文件。)
    }
    public static void test2() throws FileNotFoundException, IOException{

            test1();

    }
    public static void test3(){
        try {
            test1();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void test1() throws FileNotFoundException, IOException {
        File file = new File("hello1.txt");
        FileInputStream fis = new FileInputStream(file);
        int data = fis.read();
        while (data != -1) {
            System.out.print((char) data);
            data = fis.read();
        }
        fis.close();
    }
}
