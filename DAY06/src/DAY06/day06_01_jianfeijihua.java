package DAY06;

import java.util.Scanner;

//减肥计划
/*
   需求：输入星期数，显示今天的减肥活动   周一：跑步   周二：游泳
   周三：慢走   周四：动感单车   周五：拳击   周六：爬山
   周日：好好吃一顿
 */
public class day06_01_jianfeijihua {
    public static void main(String[] args) {
        //1.键盘录入
        Scanner sc = new Scanner(System.in);
        while (true) {
            int week = sc.nextInt();
            //2.判断输入星期几，并且输出结果
            switch (week) {
                case 1:
                    System.out.println("跑步");
                    break;
                case 2:
                    System.out.println("游泳");
                    break;
                case 3:
                    System.out.println("慢走");
                    break;
                case 4:
                    System.out.println("动感单车");
                    break;
                case 5:
                    System.out.println("拳击");
                    break;
                case 6:
                    System.out.println("爬山");
                    break;
                case 7:
                    System.out.println("好好吃一顿");
                    break;
                    default:
                        System.out.println("输入错误");
            }
        }

    }
}
