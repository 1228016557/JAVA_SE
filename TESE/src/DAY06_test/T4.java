package DAY06_test;

import java.util.Scanner;

/*
(1) 定义方法public static int getCount(int[] arr,int num)，
    求出指定元素在数组中出现的次数.
	(2)定义方法public static int getAllCount(int[] arr)，
	统计数组中出现次数为1的元素一共有多少个。
	(推荐-遍历数组，然后调用第一个方法，
	求出数组中每个元素在数组中出现的次数，如果只出现了一次，就统计)
	(3) 在main方法中定义数组，
	如int arr[]={1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};。
	然后调用getAllCount方法，统计只出现一次的元素有多少个。
	打印结果：数组中只出现一次的元素有2个
 */
public class T4 {
    public static void main(String[] args) {
      int[] arr = {1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};
//        Scanner sc =new Scanner(System.in);
//        int num = sc.nextInt();
//         int  second =   getCount(arr,num);
//        System.out.println("元素在数组出现的次数:"+second);
//        System.out.println("----------");
        //3
        int yi =getAllCount(arr);
        System.out.println("数组中元素只出现过一次的元素有"+yi+"个");

    }



    //1.求出指定元素在数组中出现的次数.
    public static int getCount(int[] arr,int num){
        int count = 0;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]==num){
                count++;
            }
        }
        return count;
    }


    //2.统计数组中出现次数为1的元素一共有多少个。
    public static int getAllCount(int[] arr){
       int sum=0;
        int count =0;
        for (int i = 0; i <arr.length; i++) {
            for (int j = 0; j <arr.length ; j++) {
                if (arr[i]==arr[j]){
                    count++;
                }
            }
            if (count==1){
                   sum++;
                }
          count=0;

        }
        return sum;
    }




}
