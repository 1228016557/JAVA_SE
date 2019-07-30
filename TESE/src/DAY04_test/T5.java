package DAY04_test;

import java.util.Random;

/*
1.定义一个用于存放班级分数的数组 int[] score;数组长度为5，并使用随机数（范围为0-100）为数组赋值
	2.求出班级不及格人数(分数低于60分的就是不及格)
	3.求出班级的平均分
	4.求出班级的总分数

 */
public class T5 {
    public static void main(String[] args) {
        //1.定义数组score
        int[] score = new int[5];

        int count = 0; //记录不及格人数
        double sum = 0;     //记录分数总和

        //2.用随机数(0-100)给数组元素赋值
        Random r = new Random();
        for (int i = 0; i < 5; i++) {
            score[i] = r.nextInt(101);

            //3.求出班级里面不及格的人数(判断语句)
            if (score[i] < 60) {
                count++;
            }
            //4.求出班级的总分数
            sum += score[i];

            System.out.println(score[i]); //输出五个人的分数

        }


        double average = sum / 5;    //记录平均数
        System.out.println("不及格人数:" + count);
        System.out.println("平均数:" + average);
        System.out.println("班级总分数:" + sum);

    }
}
