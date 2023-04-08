package com.chang.java;

public class EcmDef {

    public static void main(String[] args) {

        try {
            //**********数据类型不一致**************
//            int i = 1;
//            int j = Integer.parseInt("av");
//            int result = ecm(i,j);
            //*************************************
            //**********缺少命令行**************
            //int i = Integer.parseInt(args[0]);
            //int j = 10;
            //int result = ecm(i,j);
            //*************************************
            //**********除0**************
//            int i = 10;
//            int j = 0;
//            int result = ecm(i,j);
            //*************************************
            //************输入负数了************
            int i = 10;
            int j = -10;
            int result = ecm(i,j);
            //*************************************
        }catch (NumberFormatException e){
            System.out.println("数据类型不一致");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("缺少命令行");
        }catch (ArithmeticException e){
            System.out.println("除0");
        }catch (NegativeException e){
            System.out.println(e.getMessage());
        }
    }
    public static int ecm(int i,int j) throws NegativeException {
        if (i<0 || j<0){
            throw new NegativeException("输入负数了");
        }else {
            return i/j;
        }
    }
}
