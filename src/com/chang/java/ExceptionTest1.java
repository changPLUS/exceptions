package com.chang.java;

/*
* 一,异常的处理，抓抛模型
* 过程一:"抛"：程序在正常执行的过程中，一旦出现异常，就会在异常代码处生成一个对应异常类的对象。
*            并将此对象抛出
*
*
* 过程二："抓"：可以理解为异常的处理方式 (1)try-catch-finally (2) throws
* 二。try-catch-finally的使用
* try{
*   //可能出现异常的代码
* }catch(异常类型1 变量名1){
*   //处理异常的方式1
* }catch(异常类型2 变量名2){
*   //处理异常的方式2
* }catch(异常类型3 变量名3){
*   //处理异常的方式3
* }
* ....
* finally{
* //一定会执行的代码
* }
*
* 说明:
* 1.finally是可选的
* 2.使用try将可能出现异常代码包装起来，在执行过程中，一旦出现异常，就会生成一个对应异常类的对象
* 根据此对象的类型，去catch中进行匹配
* 3.一旦try中的异常对象匹配到某一个catch时，就进入catch中进入异常的处理。一旦处理完成，就跳出当前的
* try-catch结构（在没有写finally的情况），继续执行其后的代码
* 4.catch中的异常类型如果没有字符类关系，则谁声明在上，谁声明在下无所谓
*   catch中的异常类型如果满足字符类关系，则要求子父类关系一定声明在父类的上面，否则，报错
* 5.常用的异常对象处理的方式：（1）String getmessage() （2）printStackTrace()
* 6.在try结构中声明的变量，再出了try结构以后，就不能再被调用
* */

import javax.imageio.IIOException;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest1 {
    public static void main(String[] args) {
        test1();
        test8();
    }

    public static void test8(){
        try {


            File file = new File("hello.txt");
            FileInputStream fis = new FileInputStream(file);
            int data = fis.read();
            while (data != -1) {
                System.out.print((char) data);
                data = fis.read();
            }
            fis.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void test1(){
        String str = "123";
        str = "abc";
        try {
            int num = Integer.parseInt(str);
            System.out.println("hello----1");
        }catch (NumberFormatException e){
            //System.out.println("出现了数值转换异常");
            //异常常调用的俩种方法
            //String getmessage()
            //System.out.println(e.getMessage());For input string: "abc"
            //e.printStackTrace();
        }catch (NullPointerException e){
            System.out.println("出现了空指针异常");
        }catch (Exception e){
            System.out.println("出现了异常");
        }
        System.out.println("hello---2");
    }
}

