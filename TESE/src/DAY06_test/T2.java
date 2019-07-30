package DAY06_test;

import java.awt.event.FocusEvent;

/*
(1)定义方法public static boolean isSym(int[] arr)，判断数组中的元素值是否对称,对称返回true，不对称返回false；
	(2)在main方法中，定义一个数组，并调用方法。
	(3)打印结果：[1,2,3,4,3,2,1]是否对称：true
 */
public class T2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3,4,5, 4, 3, 2, 1};
         boolean  s =       isSym(arr);
        System.out.println(s);
    }

    //定义方法public static boolean isSym(int[] arr)，
    // 判断数组中的元素值是否对称,对称返回true，不对称返回false
    public static boolean isSym(int[] arr) {
        //判断数组是否对称和反转类似
        for (int start = 0, end = arr.length - 1; start <= end; start++, end--) {
            if (arr[start]!=arr[end]){
                    return false;
            }
        }
        return true;
    }

}
