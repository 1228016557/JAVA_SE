package day05;

import javax.sound.midi.Soundbank;

/*
遍历案例
需求：设计一个方法用于数组的遍历，要求遍历的结果在一行上的。例如：[11,22,33,44,55]
 */
public class day05_011_ergodic {
    public static void main(String[] args) {
        //1.定义一个数组
        int[] arr = {11,22,33,44,55,66,77,88,99};

        //3.调用方法
        ergodic(arr);
    }

    //2.定义一个遍历方法
    /*
       两个明确：
       1.返回值：将结果输出在控制台上，无返回值 void
       2.参数   int[] arr
     */
    public static   void  ergodic(int[] arr){
        System.out.print("[");
        for (int i = 0; (i <arr.length ) ; i++) {
            if (i == arr.length-1){
                System.out.println(arr[i]+"]");
                continue;
            }
            System.out.print(arr[i]+", ");
        }
    }

}
