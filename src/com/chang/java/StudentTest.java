package com.chang.java;

import sun.plugin2.message.Message;

public class StudentTest {
    public static void main(String[] args) {
        try {
            Student student = new Student();
            student.regist(-1001);
            System.out.println(student.toString());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

class Student{
    private int id;
    public void regist (int id) throws Exception {
        if (id>0){
            this.id = id;
        }else {
            //System.out.println("你输入的数据有误");
            throw new MyException("你输入的数据有误");
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                '}';
    }
}
