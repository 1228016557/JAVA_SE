package day08;

import java.util.Scanner;

//字符串反转升级版案例
/*
定义一个方法，实现字符串反转。键盘录入一个字符串，
调用该方法后，在控制台输出结果
例如，键盘录入abc，输出结果 cba  */
public class day08_09_fanzhuan {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入一个字符串");
         String s =  sc.nextLine();
          String a =   myserverse(s);
        System.out.println(a);
    }
    //反转方法 (返回值string,参数string)
     public  static String myserverse(String s){
        StringBuilder sb =new StringBuilder(s);
        sb.reverse();
        String ss =sb.toString();
        return ss;

     }

}
