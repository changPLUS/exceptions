package com.chang.java;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
* 1.finally是可选的
* 2.finally中声明的是一定会被执行的代码。即使catch中又出现异常了，try中有return语句，catch中有return语句等情况 test2()
*
* */
public class finallyTest{
    public static void main(String[] args) {
        //test1();
        //test2();一定会被执行的代码 Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 10
//        int result =  test3();
//        System.out.println(result);
        test4();
    }

    public static void test1(){
     try {


         int a = 10;
         int b = 0;
         System.out.println(a / b);
     }catch (ArithmeticException e){
         System.out.println(e.getMessage());
     }
    }
    public static void test2(){
        try {
            int a = 10;
            int b = 0;
            System.out.println(a / b);
        }catch (ArithmeticException e){
            int[] arr = new int[10];
            System.out.println(arr[10]);
        }finally {
            System.out.println("一定会被执行的代码");
        }
        System.out.println("1111");
    }
    public static int test3(){
        try {
            int[] arr = new int[10];
            System.out.println(arr[10]);
            return 1;
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
            return 2;
        }finally {
            System.out.println("一定会被执行的代码");
        }
    }
    public static void test4(){
        FileInputStream fis = null;
        try {
            File file = new File("hello.txt");


            int data = fis.read();
            while (data != -1) {
                System.out.print((char) data);
                data = fis.read();
            }

        }catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(fis != null){
                try {
                    fis.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }

}
