package day05;

import java.util.zip.InflaterInputStream;

/*
 方法重载:
 多个方法在同一个类中
 多个方法具有相同的方法名
 多个方法的参数不同，类型不同或者数量不同

   注意：方法的重载与返回值无关
   在调用的时候 ，java虚拟机会通过参数的不同来区分同名的方法
 */
public class day05_07_Overlod {
    public static void main(String[] args) {
   //1.调用1
        int result1 = sum(10,20);
        System.out.println(result1);
        //2.调用2
        double result2 = sum(10.0,20.0);
        System.out.println(result2);
        //3.调用3
        int result3 = sum(10,20,30);
        System.out.println(result3);



    }
    //需求1：求两个int类型数据和的方法
     public  static  int sum(int a ,int b){
        return a+b;
     }
    //需求2：求两的double类型数据和的方法
    public static double sum(double a,double b){
        return a+b;
    }
    //需求3:求三个int类型数据和的方法
    public static int sum(int a ,int b,int c){
        return a+b+c;
    }
}
