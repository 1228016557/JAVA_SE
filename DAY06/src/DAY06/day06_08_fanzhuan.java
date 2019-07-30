package DAY06;

import javax.imageio.metadata.IIOMetadataFormatImpl;

/*
已知一个数组 arr = {19, 28, 37, 46, 50}; 用程序实现把数组中的元素值交换，
 交换后的数组 arr = {50, 46, 37, 28, 19}; 并在控制台输出交换后的数组元素。
 1.定义一个数组
 2.遍历数组(需要两个变量)
 3.交换变量
 4.遍历数组
 */
public class day06_08_fanzhuan {
    public static void main(String[] args) {
        int[] arr = {19, 28, 37, 46, 50};
         fanzhuan(arr);
         bianli(arr);
    }
public  static void fanzhuan(int[] arr){
    //1.定义数组

    int temp = 0;
    //2.遍历数组
    for (int start = 0, end = arr.length - 1; start <= end; start++, end--) {
        //3.交换变量
        temp = arr[start];  //把前面数组元素存放在缓冲区
        arr[start] = arr[end]; //把后面的数放在前面
        arr[end] = temp;   //把前面的值放在后面
    }
}

    public  static void  bianli(int[] arr){
        System.out.print("{");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.println(arr[i] + "}");
            }else {
                System.out.print(arr[i] + ",");
            }
        }
    }
}
