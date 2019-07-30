package day3;

/*
跳转控制语句
1.continue:用于循环中,基于条件控制语句,跳过某次循环体内容执行,继续下一次的执行
2.break:用于循环中,基于条件控制语句 ,终止循环内容的执行,也就是说结束当前的整个循环
 */
public class day2_012_continue {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i % 2 == 0) {
                 continue;
                 //contiue跳出某次循环体内容,继续执行下一次的循环
            }
            System.out.println(i);
        }
        System.out.println("------");
        for (int i = 1; i <= 5; i++) {
            if (i % 2 == 0) {
                break;
                //break直接跳出循环,结束当前整个循环体
            }
            System.out.println(i);
        }



    }
}
