package day3;

import java.util.Random;
import java.util.Scanner;

public class day2_00_practice {
    public static void main(String[] args) {
        zuoye();
    }

    //1.春夏秋冬
    public static void month() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个月份");
        int month = sc.nextInt();
        switch (month) {
            case 12:
            case 1:
            case 2:
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

    public static void output() {
        int i = 1;
        for (i = 1; i <= 5; i++) {
            System.out.println(i);

        }
        for (i = 5; i >= 1; i--) {
            System.out.println(i);
        }


    }

    public static void zuoye4() {
        /*
        需求:输出一个所有十位加上百位等于个位加上千位的四位数,并且输出总数
         */


        //定义一个计数器,记录i的个数
        int sum = 0;
        for (int i = 1000; i < 9999; i++) {

            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100 % 10;
            int qian = i / 1000;
            //判断i是否满足条件
            if (bai + shi == ge + qian) {
                //每满足一次条件sum就加一

                //判断是否到达5个(count从0开始)
                System.out.print(i + "    ");
                sum++;
                if (sum % 5 == 0) {
                    System.out.println("");

                } else {

                }
            }


        }
        System.out.println("");
        System.out.println("总数为:" + sum);

    }

    //day3作业2
    public static void zuoye() {
        for (int x = 1; x <= 10; x++) {
            if (x % 3 == 0) {
                System.out.println("a");
            }
            System.out.println("Java基础班");
        }
    }

    /*day3作业3:
    1.打印1到100之内的整数，但数字中包含9的要跳过
	2.每行输出5个满足条件的数，之间用空格分隔
	3.如：1 2 3 4 5
     */
    public static void zuoye3() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {

            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100 % 10;
            if (ge == 9 || bai == 9 || shi == 9) {
                continue;
            }
            sum++;
            if (sum % 5 == 0) {
                System.out.println(i + "  ");
            } else {
                System.out.print(i + "    ");
            }


        }
    }

    public static void zuoye5() {

        //  需求:输出四行五列*    i控制行数
        for (int i = 1; i <= 4; i++) {
            //j控制列数
            System.out.println();
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
        }

    }

    public static void narcissus() {
        //需求:输出水仙花个数
        //1.定义一个变量用来记水仙花的个数
        int sum = 0;
        //2.遍历所有的三位数
        for (int i = 100; i < 1000; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100;
            //3.判断是否满足水仙花条件,并且加1
            if (ge * ge * ge + shi * shi * shi + bai * bai * bai == i) {
                sum++;
            }

        }
        //4.输出水仙花个数
        System.out.println("水仙花一共有:" + sum + "个");
    }

    public static void guessnumber() {
        //需求:猜数字

        //1.随机生成一个数字
        Random r = new Random();
        int number = r.nextInt(100) + 1;

        while (true) {
            //2.输入你猜的数字
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入你猜的数字");
            int guessnumber = sc.nextInt();

            //3.对比数字的大小
            if (guessnumber > number) {
                System.out.println("猜的数字太大了");
            } else if (guessnumber < number) {
                System.out.println("猜的数字太小了");
            } else {
                System.out.println("恭喜你猜中了");
                break;
            }
        }
    }

    public static void zf() {
       /* 需求:珠穆朗玛峰高8844430毫米,加入我有一张足够大的纸张,它的厚度0.1毫米
                请问,折叠多少次,可以折叠成珠穆朗玛峰的高度
*/
        int zf = 8844430;
        double paper = 0.1;
        int count = 0;
        while (zf > paper) {
            paper *= 2;
            count++;
        }
        System.out.println("折叠次数:" + count + "次");
        System.out.println("纸张最终厚度:" + paper + "毫米");
    }

    public static void conb() {
        //1.买衣服
        for (int i = 1; i <= 10; i++) {
            System.out.println("正在逛第" + i + "家商店");
            if (i == 5) {
                System.out.println("买了");
                break;
            }
        }
        System.out.println("---------------");
        //2.吃草莓
        for (int j = 1; j <= 10; j++) {

            if (j == 5) {
                System.out.println("扔了");
                continue;
            }
            System.out.println("正在吃" + j + "个草莓");

        }
    }

    public static void guess_number() {
        //1.产生随机数
        Random r = new Random();
        int number = r.nextInt(100)+1;
        //要猜很多次,所以要键盘录入多次,因为不知道循环几次,所以要用循环while
        while (true) {
            //2.键盘录入数字
            Scanner sc = new Scanner(System.in);
            int guessnumber = sc.nextInt();
            //3.比较大小
            if (guessnumber > number) {
                System.out.println("你猜的数字太大了");
            } else if (guessnumber < number) {
                System.out.println("你猜的数字太小了");
            } else {
                System.out.println("恭喜你答对了");
                //对了以后跳出循环
                break;
            }
        }
    }


}



