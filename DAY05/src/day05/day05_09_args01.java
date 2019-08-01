package day05;

/*
注意：
对于基本数据类型的参数，形参的改变，不影响实参的值
 */
public class day05_09_args01 {
    public static void main(String[] args) {
        int number =100;
        System.out.println("调用change方法前："+number);
        change(number);
        System.out.println("调用change方法后："+number);
    }
    public  static void  change(int number){
        number =200;
    }
}
