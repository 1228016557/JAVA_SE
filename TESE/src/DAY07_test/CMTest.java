package DAY07_test;

import java.security.PublicKey;

/*
2.定义测试类,在main方法中创建该类的对象并给属性赋值(演示两种方法:setter方法和构造方法)
		3.调用成员方法,打印格式如下:
			工号为123基本工资为15000奖金为6000的项目经理正在努力的做着管理工作,分配任务,检查员工提交上来的代码.....
			工号为135基本工资为10000的程序员正在努力的写着代码......
 */
public class CMTest {
    public static void main(String[] args) {
        Coder c =new Coder();
        Manager m = new Manager();

        //setter方法
        c.setId(135);
        c.setSalary(10000);
        m.setId(123);
        m.setSalary(15000);
        m.setBonus(6000);
        System.out.println("工号为"+m.getId()+"基本工资为"+m.getSalary()+"奖金为"+m.getBonus()+"的项目经理正在努力的做着管理工作,分配任务,检查员工提交上来的代码.....");
        System.out.println("工号为"+c.getId()+"基本工资为"+c.getSalary()+"的程序员正在努力的写着代码......");
    //构造方法
        Coder c1 = new Coder("sss",20,13000);
        Manager m1 = new Manager("ss",20,15000,5000);
    }
}
