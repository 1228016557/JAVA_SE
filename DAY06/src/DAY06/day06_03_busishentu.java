package DAY06;
     /*
     不死神兔
     需求：有一对兔子，从出生后第3个月起每个月都生一对兔子，
     小兔子长到第三个月后每个月又生一对兔子，
     假如兔子都 不死，问第二十个月的兔子对数为多少？


     分析：
     1   1    2    3   5   8.。。。。。。。。。。
     每一个数据是前两个数据的和
     arr[0]=1
     arr[1]=1
     arr[2]=2
     arr[3]=3
     以此类推
      */


import javax.sound.midi.Soundbank;

public class day06_03_busishentu {
    public static void main(String[] args) {
        //1.定义一个int型数组，记录每月兔子的个数
        int[] arr = new int[20];
        //2.定义前两个月的兔子数
        arr[0] = 1;
        arr[1] = 1;
        //3.用循环来计算每个月的兔子数
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        //输出第二十个月的兔子数
        System.out.println("第二十个月兔子的个数：" + arr[19]);
    }
}
