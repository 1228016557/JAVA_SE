package DAY07_test;
/*
在main方法中创建该类的对象并给属性赋值(演示两种方法:setter方法和构造方法)
3.调用三个成员方法,打印格式如下:
			正在使用价格为998元的小米品牌的手机打电话....
			正在使用价格为998元的小米品牌的手机发短信....
			正在使用价格为998元的小米品牌的手机玩游戏....
 */
public class TeseT2 {
    public static void main(String[] args) {
        //有参构造
        T2 p = new T2("小米",998);
        System.out.print("正在使用价格为"+p.getPrice()+"的"+p.getBrand()+"品牌的手机");
        p.call();
        System.out.print("正在使用价格为"+p.getPrice()+"的"+p.getBrand()+"品牌的手机");
        p.sendMessage();
        System.out.print("正在使用价格为"+p.getPrice()+"的"+p.getBrand()+"品牌的手机");
        p.games();



        T2 p1 = new T2();
        p1.setBrand("小米");
        p1.setPrice(998);
    }
}
