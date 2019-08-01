package day05;

/*
  注意：
  对于引用数据类型的参数，形式参数的改变，影响实际参数的值
 */
public class day05_010_args02 {
    public static void main(String[] args) {
        int[] number = {10, 20, 30};
        System.out.println(number[1]);
        change(number);
        System.out.println(number[1]);
    }
public  static  void change(int[] number ){
        number[1]=200;
}

}
