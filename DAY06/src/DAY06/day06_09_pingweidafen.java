package DAY06;

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
public class day06_09_pingweidafen {
    public static void main(String[] args) {
      //1:定义一个数组，用动态初始化完成数组元素的初始化，长度为6 
       int[] arr = new int[6];
      //2:键盘录入评委分数  
        Scanner sc =new Scanner(System.in);
      //3:由于是6个评委打分，所以，接收评委分数的操作，用循环改进    
        for (int i = 0; i <6 ; i++) {
            System.out.println("请第"+(i+1)+"个评委打分");
             arr[i] = sc.nextInt();
        }
            int maxnumber  = getMax(arr); //接收最大值
            int minnumber =getMix(arr); //接收最小值
                 int sum = getSum(arr);


        // 7:按照计算规则进行计算得到平均分        
             int avg = (sum-maxnumber-minnumber)/4;
        // 8:输出平均分
        System.out.println("选手最后得分："+avg);




    }
      //4:定义方法实现获取数组中的最高分(数组最大值)，调用方法    
  public  static int  getMax(int[] arr ){
        int max = arr[0];
        for (int i = 1; i <arr.length ; i++) {
          if (arr[i]>max){
              max = arr[i];
          }
      }
      return  max;
  }
      //5:定义方法实现获取数组中的最低分(数组最小值) ，调用方法
      public  static int  getMix(int[] arr ){
          int mix = arr[0];
          for (int i = 1; i <arr.length ; i++) {
              if (arr[i]<mix){
                  mix = arr[i];
              }
          }
          return  mix;}
      //6:定义方法实现获取数组中的所有元素的和(数组元素求和) ，调用方法        
        public static int getSum(int[] arr ) {
        int sum =0;
            for (int i = 0; i < arr.length; i++) {
                 sum+=arr[i];
            }
            return sum;
        }





}
