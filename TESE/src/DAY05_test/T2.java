package DAY05_test;

import DAY04_test.T4;

/*
1.求两个整数之和
	2.求两个小数之和
	3.判断两个整数是否相等
	4.判断两个小数是否相等
	5.获取两个整数中较大的值
	6.获取两个小数中较大的值
	7.获取两个整数中较小的值
	8.获取两个小数中较小的值
	9.用一个方法获取两个整数中较大的值或较小的值---(int a,int b ,boolean falg)//flag 旗标，标记   flag=true 最大值，flag=false 最小值
 */
public class T2 {
    public static void main(String[] args) {
        t1();
        t2();
        t3(1, 2);
        t4(1.0, 1.0);
        //5，获取两个整数中的较大值
        System.out.println(t5(10, 20));
        //6.获取两个小数中较大的值
        System.out.println(t6(20.1, 32.5));
        //7.获取两个整数中较小的值
        System.out.println(t7(10, 20));
        //8.获取两个小数中较小的值
        System.out.println(t8(20.1, 32.5));
        //9
        t9(10,20,false);
    }

    //1.求两个整数之和
    public static void t1() {
        int a = 10;
        int b = 20;
        System.out.println(a + b);
    }

    //2.求两个小数之和
    public static void t2() {
        double a = 9.2;
        double b = 4.0;
        System.out.println(a + b);
    }

    //3.判断两个整数是否相等
    public static void t3(int a, int b) {
        if (a == b) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    //4.判断两个小数是否相等
    public static void t4(double a, double b) {
        if (a == b) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    //5.获取两个整数中较大的值
    public static int t5(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    //6.获取两个小数中较大的值
    public static double t6(double a, double b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    //7.获取两个整数中较小的值
    public static int t7(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }
    //8.获取两个小数中较小的值
    public static double t8(double a, double b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }
    //9.用一个方法获取两个整数中较大的值或较小的值---(int a,int b ,boolean falg)//flag 旗标，标记   flag=true 最大值，flag=false 最小值
  public  static  void t9( int a,int b,boolean flag) {
      if (flag == true) {
          if (a > b) {
              System.out.println(a);
          } else {
              System.out.println(b);
          }

      }
      if (flag == false) {
          if (a < b) {
              System.out.println(a);
          } else {
              System.out.println(b);
          }
      }


  }


}
