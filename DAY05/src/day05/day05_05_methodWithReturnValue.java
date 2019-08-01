package day05;

//带有返回值方法的定义和调用
public class day05_05_methodWithReturnValue {
    public static void main(String[] args) {
     //调用格式：
     //1.方法名（参数）
        System.out.println(isEvenNumber(10));
     //2.数据类型 变量名 = 方法名（参数）
     boolean flag = isEvenNumber(10);
        System.out.println(flag);


    }
    //定义一个方法，该方法接受一个数据，判断该方法是否为偶数，并且返回真假值
    public  static boolean isEvenNumber( int number){
     if (number%2==0){
         return true;
     }else {
         return false;
     }

    }


}
