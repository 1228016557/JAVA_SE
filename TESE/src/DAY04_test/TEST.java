package DAY04_test;

public class TEST {
    public static void main(String[] args) {
        method1();						  //第1行
         //第2行
        double d = method3();               //第3行
        int num = method3();			   //第4行
    }

    public static void method1() {
        System.out.println("天天开心");
    }

    public static void method2() {
        System.out.println("代码so easy!");
    }

    public static int method3() {
        return 3*5;
    }
}
