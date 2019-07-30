package DAY06;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

/*
逢七过
需求：从任意一个数字报数，当你要报的数字包含七或者是7的倍数时都要说：过。
我们直接在控制台打印出1-100之间逢七必过的规则数据
 */
public class day06_02_fengqiguo {
    public static void main(String[] args) {
        //1.随机报数，则键盘录入一个数字
        Scanner sc =new Scanner(System.in);
       int num =  sc.nextInt();
        int count=0;
        //2.从随机数开始往后数，并判断
        for (int i = num; i <701 ; i++) {
            //为七的倍数或者包含7的数字跳过
            if (i%7==0||i%10==7||i/10%10==7||i/100%10==7){
                continue;
            }
            count++;
            System.out.print(i+" ");
            if (count%5==0){
                System.out.println();
            }
        }

    }


}
