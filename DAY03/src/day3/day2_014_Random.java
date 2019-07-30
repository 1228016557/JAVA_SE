package day3;

import java.util.Random;

public class day2_014_Random {
    public static void main(String[] args) {
        //创建对象
        Random r = new Random();
    //用循环获取十个随机数
        for (int i = 0; i < 10; i++) {
            //获取随机数  范围(0,10] 不包括10
            int number = r.nextInt(10);
            System.out.println("number:" + number);
        }
        //需求:获取一个1到100之间的随机数
          int x= r.nextInt(100)+1;
        System.out.println(x);
    }


}
