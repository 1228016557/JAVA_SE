package day04;

//输出数组中的最大值
public class day04_04_MaxNumber {
    public static void main(String[] args) {
        int[] arr = {14,52,82,42,11,5,62,88,48,12,54,848,1,84};
        //1.定义一个变量max用来存贮最大值
        int max = arr[0];
        //3.循环
        for (int i = 1; i <arr.length ; i++) {
            //2.比较
            if (arr[i]>max){
                max = arr[i];
            }
        }

        System.out.println(max);
    }

}
