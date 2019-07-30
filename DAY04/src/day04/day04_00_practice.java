package day04;

public class day04_00_practice {
    public static void main(String[] args) {
        int[] arr = {12, 14, 25, 8, 2, 62, 22};
        ergodic(arr);
        int number = getMax(arr);
        System.out.println("最大值是:"+number);
    }

    public static void ergodic(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    //获取数组中的最大值
    /*
       两个明确:
       返回值类型: int
       参数: int[] arr
     */

    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }


}
