package day05;

//带参数的方法
public class day05_03_parametricMethod {
    public static void main(String[] args) {
        //常量的调用
        isEvenNumber(10);

        // 变量的调用
        int a = 20;
        isEvenNumber(a);
    }

    //需求：定义一个方法，该方法接受一个参数，判断该参数是否为偶数
    public  static  void isEvenNumber(int number){
        if (number%2==0){
            System.out.println(true);
        }else {
            System.out.println(false);
        }

    }

}
