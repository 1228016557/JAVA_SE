package day08;
/*
StringBuilder类添加和反转方法
public StringBuilder append(任意类型) 添加数据，并返回对象本身
public StringBuilder reverse()        返回相反的字符序列

 */
public class day08_06_stringbuider_append_reverse {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        //append()   添加数据
        StringBuilder sb2 = sb.append("hello");
        System.out.println("sb:"+sb);
        System.out.println("sb2:"+sb2);
        System.out.println(sb==sb2);
        System.out.println("--------");
        StringBuilder sb3 = new StringBuilder();
        sb3.append("hello");
        sb3.append("world");
        sb3.append("java");
        sb3.append(100);
        System.out.println(sb3);
        //反转 .reverse
        sb3.reverse();
        System.out.println(sb3);
    }
}
