package day08;
//StringBuilder和String相互转换
/*
StringBuilder转换为String
通过 toString() 就可以实现把 StringBuilder 转换为 String .
String转换为StringBuilder
通过构造方法就可以实现把 String 转换为 StringBuilder
 */
public class day08_07_xianghuzhuanhuan {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("hello");
        //StringBuilder转换为String
        String s =sb.toString();
        System.out.println(s);


        String a = "world";
       // String转换为StringBuilder
        StringBuilder ss = new StringBuilder(a);
        System.out.println(ss);

    }
}