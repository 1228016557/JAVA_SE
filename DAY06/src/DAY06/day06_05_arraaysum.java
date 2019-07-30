package DAY06;

/*
数组求和
需求：有这样的一个数组，元素是{68,27,95,88,171,996,51,210}。
求出该数组中满足要求的元素和，
要求是：求和的元 素个位和十位都不能是7，并且只能是偶数
 */
public class day06_05_arraaysum {
    public static void main(String[] args) {
        //1.定义一个数组
        int[] arr = {68, 27, 95, 88, 171, 996, 51, 210};
        //2.定义一个变量sum用来保存元素和
        int sum = 0;
        //3,遍历数组，获取数组中的每一个值
        for (int i = 0; i < arr.length; i++) {
            //4.判断元素是否满足条件
            if (arr[i] % 10 != 7 && arr[i] / 10 % 10 != 7 && arr[i] % 2 == 0){
                sum+=arr[i];
            }
        }
        System.out.println(sum);
    }
}
