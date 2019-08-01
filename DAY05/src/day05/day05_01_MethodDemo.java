package day05;/*
   方法:是将具有独立功能的代码组指成为一个整体，使其具有特殊功能的代码集

   定义格式：
   public static void 方法名(){
   //方法体
   }

   调用格式：
   方法名();
 */

public class day05_01_MethodDemo {
    public static void main(String[] args) {
   isEvenNumber();
    }

    //定义一个方法，在方法中定义一个变量，判断该数据是都为偶数
    public static void isEvenNumber( ) {
        int number =10;
        if (number % 2 == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }

}





