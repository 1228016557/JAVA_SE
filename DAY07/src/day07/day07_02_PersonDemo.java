package day07;
  //人类测试
public class day07_02_PersonDemo {
      public static void main(String[] args) {
          day07_02_Person p = new day07_02_Person();
            p.setAge(18);
            p.setName("阿七");
         p.show();

          System.out.println(p.getName()+"---"+p.getAge());

          day07_02_Person p1  = new day07_02_Person("鸡大宝",-2);
                p1.show();
      }


}
