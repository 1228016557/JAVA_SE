package day05;

import java.sql.SQLOutput;
import java.util.IllegalFormatCodePointException;
import java.util.Scanner;

//练习
public class day05_00_practice {
    public static void main(String[] args) {
        //1.玩游戏
        System.out.println("小明想玩游戏");
        wanyouxi();
        //2.输出两数字的最大值
        getMax();
        //3.带参数比较俩个数字，并且输出最大值
        argsGetMax(80,20);
        //4.带参数判断是否为偶数
        isEvenNumber(12);
        //5.遍历
        int [] arr ={12,58,6,5,72,5};
        bianli(arr);

    }

    public static void wanyouxi() {
        System.out.println("打开手机");
        System.out.println("打开网络");
        System.out.println("找到游戏");
        System.out.println("打开游戏");
        System.out.println("玩游戏");
    }

    public static void getMax() {
        int a = 10;
        int b = 20;
        int num = a > b ? a : b;
        System.out.println(num);
    }
//3.带参数比较俩个数字，并且输出最大值
    public  static void argsGetMax(int a,int b){
    int num = a>b?a:b;
        System.out.println(num);
    }
    //4.带参数判断是否为偶数
    public static void isEvenNumber(int a) {
        if (a % 2 == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
    //遍历
    public  static  void  bianli(int[] arr){
        System.out.print("{");
        for (int i = 0; i <arr.length ; i++) {
         if (i == arr.length-1) {
             System.out.println(arr[i]+"}");
         }
         else {
             System.out.print(arr[i]+",");
         }
        }


    }
}
