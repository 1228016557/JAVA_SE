package DAY06_2;

import java.util.Scanner;

/*
 评委打分：
      在编程竞赛中，有6个评委为参赛的选手打分，分数为0-100的整数分。
      选手的最后得分为：去掉一个最高分和一 个最低分后 的4个评委平均值
       (不考虑小数部分)
         1:定义一个数组，用动态初始化完成数组元素的初始化，长度为6   
        2:键盘录入评委分数      
         3:由于是6个评委打分，所以，接收评委分数的操作，用循环改进    
        4:定义方法实现获取数组中的最高分(数组最大值)，调用方法    
        5:定义方法实现获取数组中的最低分(数组最小值) ，调用方法
       6:定义方法实现获取数组中的所有元素的和(数组元素求和) ，调用方法


 */
public class pingweidafen {
    public static void main(String[] args) {
       int[] arr = new int[6];
        Scanner sc =new Scanner(System.in);
        for (int i = 0; i <arr.length ; i++) {
            System.out.println("请第"+i+"位主持人打分");
            arr[i] =sc.nextInt();  //动态获取六个分数
        }
        bianli(arr);
        int max = getMax(arr);
        int min = getMix(arr);
        int sum = sum(arr);
        int avg = (sum-max-min)/(arr.length-2);
        System.out.println("最终得分:"+avg);
    }
    //显示评委打分
    public static void  bianli(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i==arr.length-1){
                System.out.println(arr[i]+"]");
            }
            else {
                System.out.print(arr[i]+",");
            }

        }
    }
   //获取最大值
    public  static  int getMax(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max<arr[i]){
                max=arr[i];
            }

        }
        return max;
    }

    //获取最小值
    public  static  int getMix(int[] arr){
        int mix = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (mix>arr[i]){
                mix=arr[i];
            }

        }
        return mix;
    }
    //获取分数总和
    public  static  int sum(int[] arr){
        int sum = 0;
        for (int i = 0; i <arr.length ; i++) {
            sum+=arr[i];
        }
        return sum;
    }
}
