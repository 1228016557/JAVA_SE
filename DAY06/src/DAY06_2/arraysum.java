package DAY06_2;
/*
数组求和
需求：有这样的一个数组，元素是{68,27,95,88,171,996,51,210}。
求出该数组中满足要求的元素和，
要求是：求和的元 素个位和十位都不能是7，并且只能是偶数
 */

import javax.sound.midi.Soundbank;

public class arraysum {
    public static void main(String[] args) {
        //1.定义数组
        int[] arr={68,27,95,88,171,996,51,20};
        int sum =0;  //定义一个和,用来计算总和
        //2.用遍历获取符合条件的元素
        for (int i = 0; i <arr.length ; i++) {
                  if (arr[i]%10!=7&&arr[i]/10%10!=7&&arr[i]%2!=0){
                      sum+=arr[i];
                  }
        }
        //输出总和
        System.out.println(sum);
    }
}
