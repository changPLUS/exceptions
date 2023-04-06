import java.io.File;
import java.io.FileInputStream;
import java.util.Date;
import java.util.Scanner;

public class ExceptionTest {
    public static void main(String[] args) {
        //空指针异常举例
        //test1();Exception in thread "main" java.lang.NullPointerException
        //test2();Exception in thread "main" java.lang.NullPointerException
        //越界异常举例
        //test3();数组越界Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException
        //类型转换异常
        //test4();Exception in thread "main" java.lang.ClassCastException
        //input输入异常
        //test5();Exception in thread "main" java.util.InputMismatchException 7.54
        //类型转换异常
        //test6();Exception in thread "main" java.lang.NumberFormatException
        //算术异常
        //test7();Exception in thread "main" java.lang.ArithmeticException: / by zero
        //编译时异常
        //test8()
    }
    //*********************************以下是编译时异常**********************************
    /* public static void test8(){
        File file = new File("hello.txt");
        FileInputStream fis = new FileInputStream(file);
        int data = fis.read();
        while (data != -1){
            System.out.print((char)data);
            data = fis.read();
        }
        fis.close();
    }*/
    //*********************************以下是运行是异常************************************
    public static void test1(){
        int[] arr = null;
        System.out.println(arr[1]);
    }
    public static void  test2(){
        String str = "abc";
        str=null;
        System.out.println(str.charAt(0));
    }
    public static void test3(){
        int[] arr = new int[10];
        System.out.println(arr[10]);
    }
    public static void test4(){
        Object obj =  new Date();//向上转型
        String str = (String)obj;
    }
    public static void test5(){
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        System.out.println(i);
    }
    public static void test6(){
        String str = "123";
        str = "abc";
        int i = Integer.parseInt(str);
    }
    public static void test7(){
        int a = 10;
        int b = 0;
        int c = a / b;
    }
}
