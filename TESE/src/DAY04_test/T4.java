package DAY04_test;

import java.util.Random;

/*
  (1)定义一个长度为10的int类型数组，元素值使用随机数生成（范围为50-80）
	  (2)打印该数组中满足个位和十位不包含7的元素。
 */
public class T4 {
    public static void main(String[] args) {
    //1.定义一个int型长度为10的数组
    int[] arr =new  int[10];
    Random r = new Random();
    //2.运用循环使数组元素接收随机数(50-80之间的随机数)
    for(int i=0;i<10;i++){
        arr[i] = r.nextInt(31)+50;
       //3.判断数组元素是否含有7
        if (  arr[i] %10 ==7 || arr[i]/10==7 ){
            continue;
        }
        //4.打印数组元素
        System.out.println(arr[i]);
    }



}
   }