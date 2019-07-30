package day3;
//输入一个星期数,然后系统输出今天星期几
import java.util.Scanner;

/*
格式:
    switch(表达式){
         case 值1:
         语句体1;
         break;
         case 值2:
         语句体2;
         break;
         .....
         default:
         语句体n;
         [break;]
    }
 */
 public class day2_01_switch {
    public static void main(String[] args) {
        System.out.println("开始.");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个星期数");
        int week = sc.nextInt();
        switch (week){
            case 1 :
                System.out.println("今天星期一");
                break;
            case  2 :
                System.out.println("今天星期二");
            break;
            case  3 :
                System.out.println("今天星期三");
                break;
            case  4 :
                System.out.println("今天星期四");
                break;
            case  5 :
                System.out.println("今天星期五");
                break;
            case  6 :
                System.out.println("今天星期六");
                break;
               default   :
                System.out.println("今天星期七");
                break;


        }
        System.out.println("结束");

    }


}
