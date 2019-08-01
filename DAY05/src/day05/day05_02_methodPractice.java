package day05;

//方法练习
//需求：设置一个打印两个数中的较大值
public class day05_02_methodPractice {
    public static void main(String[] args) {
//调用两个数中较大值的方法
        getMax();

    }

    //定义一个打印两个数中的较大值的方法
    public static void getMax() {
   //定义两个变量用来存储两个数字
        int a = 10;
        int b = 20;
  //判断两个数字的大小,并输出较大值
        if (a>b){
            System.out.println(a);
        }
else {
            System.out.println(b);
        }
    }

}
