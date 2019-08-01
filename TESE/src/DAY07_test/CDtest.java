package DAY07_test;
/*
1.按照以上要求定义Cat类和Dog类,属性要私有,生成空参、有参构造，setter和getter方法
		2.定义测试类,在main方法中创建该类的对象并给属性赋值(演示两种方法:setter方法和构造方法)
		3.调用成员方法,打印格式如下:
			花色的波斯猫正在吃鱼.....
			花色的波斯猫正在逮老鼠....
			黑色的藏獒正在啃骨头.....
			黑色的藏獒正在看家.....
 */
public class CDtest {
    public static void main(String[] args) {
        //构造方法

        Cat c =new Cat("花色","波斯猫");
        System.out.println(c.color+"的"+c.breed+"正在吃鱼");
        System.out.println(c.color+"的"+c.breed+"正在逮老鼠");
        Dog d = new Dog("黑色","藏獒");
        System.out.println(c.color+"的"+c.breed+"正在啃骨头");
        System.out.println(c.color+"的"+c.breed+"正在看家");


        //setter方法
        Cat c1 = new Cat();
        Dog d1 =new Dog();
        c1.setColor("花色");
        c1.setBreed("波斯猫");
        d1.setColor("黑色");
        d1.setBreed("藏獒");
    }
}
