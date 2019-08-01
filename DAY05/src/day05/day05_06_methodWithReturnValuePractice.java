package day05;

/*
  带有返回值方法练习
需求：设计一个方法，可以获取两个数中的较大值，数据来自参数
 */
public class day05_06_methodWithReturnValuePractice {
    public static void main(String[] args) {
   //3.调用方法
        int number = getMax(10,20);
        System.out.println(number);
    //直接输出打印结果
        System.out.println(getMax(10,20));

    }
    //1.定义一个带有返回值int和两个参数的方法
    public static int getMax(int a, int b){
        //2.用分支语句来对数字大小进行处理
        if (a>b){
            return a;
        }
        else {
            return b;
        }
    }

}
