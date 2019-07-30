package DAY06;
//😡
import java.util.Scanner;

/*
查找
需求：已知一个数组 arr = {19, 28, 37, 46, 50}; 键盘录入一个数据，
查找该数据在数组中的索引。
并在控制台输出找到的索引值。如果没有查找到，则输出-1

 */
public class day06_07_chazhao {
    public static void main(String[] args) {
/*    //1.定义一个数组
    int[] arr = {19, 28, 37, 46, 50};
    //2.键盘录入一个数字
    Scanner sc = new Scanner(System.in);
    //5.找不到则输出-1
     int index =-1;
    int num = sc.nextInt();
    //3.循环遍历得到元素进行对比
        for (int i = 0; i <arr.length ; i++) {
            //4.如果找到则输出i值
              if (num == arr[i]){
                  index=i;
                  break;
              }
        }
        System.out.println("查找的索引值："+  index);*/
 chazhaotwo();
}
public static void chazhaotwo(){

        //定义一个数组
        int[] arr2 = {12,52,92,82,888,366,666};
        int a= -1;
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

    for (int i = 0; i <arr2.length ; i++) {
        if (arr2[i]==number ){
            a = i;
            break;
        }
    }
    System.out.println(a);

}}

