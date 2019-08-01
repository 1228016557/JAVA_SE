package DAY06_2;

import java.util.Scanner;

/*
查找
需求：已知一个数组 arr = {19, 28, 37, 46, 50}; 键盘录入一个数据，
查找该数据在数组中的索引。
并在控制台输出找到的索引值。如果没有查找到，则输出-1

 */
public class chazhao {
    public static void main(String[] args) {
        int[]    arr = {19,28,37,46,50,46,19};
    chazhaoshu(arr);
}
public static void  chazhaoshu(int[] arr){
    Scanner sc =new Scanner(System.in);
    int num = sc.nextInt();
    int a=0;
    int i = 0;
    for (; i < arr.length; i++) {
        if (arr[i]==num){
            a=i;
            System.out.println(i);
            a++;
        }
    }
    if (a==0){
        System.out.println("-1");
    }



}



}