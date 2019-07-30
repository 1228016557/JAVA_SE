package DAY06;

/*
数组内容相同
定义一个方法，用于比较两个数组的内容是否相同
 */
public class day06_06_arraySame {
    public static void main(String[] args) {
        //1.定义两个数组
        int[] arr1 = {12, 25, 13, 45};
        int[] arr2 = {12, 25, 13, 45};
        boolean result = arraysame(arr1, arr2);
        System.out.println(result);
    }

    //2.定义一个方法判断是否相同
       /*
       两个明确
      1.返回值   boolean
      2.参数 int[]
     */
    public static boolean arraysame(int[] arr1, int[] arr2) {
        if (arr1.length == arr2.length) {
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] == arr2[i]) {
                } else {
                    return false;
                }
            }
            return true;

        }

        else {
            return false;
        }
    }
}
