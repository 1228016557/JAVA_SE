package day05;

import java.util.concurrent.ForkJoinTask;

/*
获取数组最大值
需求：设计一个方法用于获取数组中的最大值，调用方法并输出结果
3.调用并输出
 */
public class day05_012_getMax {
    public static void main(String[] args) {
        // 1.定义一个数组
        int[] arr = {12, 52, 42, 662, 552, 885, 620};

        //3.调用方法
        int result = getMax(arr);
        System.out.println(result);
    }

    //2.定义一个方法获取最大值
    /*
    两个明确：
    1.返回值：int
    2.参数 int[] arr
     */
    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

}
