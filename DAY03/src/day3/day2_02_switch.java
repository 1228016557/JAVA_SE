package day3;

import java.util.Scanner;

/* 春夏秋冬
     需求:一年有12个月,分为春夏秋冬,键盘录入一个月份,请用程序实现判断该月份属于哪个季节,并输入
     * */
public class day2_02_switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个月份");
        int month = sc.nextInt();
        switch (month) {
            case 1:
            case 2:
            case 12:
                System.out.println("冬季");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋季");
                break;
            default:
                System.out.println("输入有误");
        }
    }
}
