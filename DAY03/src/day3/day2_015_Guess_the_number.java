package day3;

import java.util.Random;
import java.util.Scanner;

public class day2_015_Guess_the_number {
    public static void main(String[] args) {


    //猜数字游戏

    //1.随机产生一个随机数
    Random r = new Random();
    int number = r.nextInt(100 ) + 1;
     while(true){
        //2.输入猜的数字
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入你要猜的数字");
        int guessnumber = sc.nextInt();
        //3.判断输入的数字过大或者过小
        if (guessnumber > number) {
            System.out.println("你猜的数字太大了");
        } else if (number > guessnumber) {
            System.out.println("你猜的数字太小了");
        } else {
            System.out.println("恭喜你猜中了");
            break;
        }
    }
}
}