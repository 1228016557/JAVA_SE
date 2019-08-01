package day05; //带参数的方法练习

public class day05_04_parametricMethodPractice {
    public static void main(String[] args) {
   //调用getMax方法（使用常量）
    getMax(10 ,5);
    //调用方法的时候，人家要几个你就给几个，人家要什么类型，你就给什么类型的

    //调用getMax方法（使用变量）
        int i =10;
        int j= 20;
        getMax(i,j);

    }
   //定义一个含有两个参数用来获取两个数字中较大数的方法
    public  static void getMax(int a,int b ){
        if (a>b){
            System.out.println(a);
        }
        else {
            System.out.println(b);
        }


    }



}
