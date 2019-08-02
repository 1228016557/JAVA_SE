package day08;

import java.util.Scanner;

/*
键盘录入一个字符串，使用程序实现在控制台遍历该字符串
 */
public class day08_02_bianlizifuchuan {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String line = sc.nextLine();

        for (int i = 0;i <line.length();i++) {
            System.out.println(line.charAt(i));
        }
        }

}
