package day3;

//水仙花
//需求:在控制台输出所有水仙花数
public class day2_07_narcissus {
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 10 /10 ;

            if (ge * ge * ge + shi * shi * shi + bai * bai * bai == i) {
                System.out.println(i);

            }
        }
    }
}
