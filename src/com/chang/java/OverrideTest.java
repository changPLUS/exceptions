package com.chang.java;

import java.io.FileNotFoundException;
import java.io.IOException;
/*
* 方法重写的规则之一：
* 子类重写的方法抛出的异常类型不大于父类被重写的方法抛出的异常类型
* */
public class OverrideTest {
    public static void main(String[] args) {
        OverrideTest overrideTest = new OverrideTest();
        overrideTest.display(new SubClass());
    }

    public  void display(SuperClass superClass) {
        try {
            superClass.method();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class SuperClass {
    public  void method() throws IOException {
        System.out.println("1111");
    }
}
class SubClass extends SuperClass {
    public  void method() throws FileNotFoundException {//！通过！ 子类重写的方法抛出的异常类型不大于父类被重写的方法抛出的异常类型
        System.out.println("2222222");
    }
//    public static void method() throws Exception {！不通过！ 子类重写的方法抛出的异常类型不大于父类被重写的方法抛出的异常类型
//            System.out.println("2222222");
//       }
}
