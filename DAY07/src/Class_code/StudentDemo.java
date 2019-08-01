package Class_code;
 //测试学生类
public class StudentDemo {
     public static void main(String[] args) {
         Student  s =new Student("asd",15);
         s.name = "王二";
         s.gender = "男";
         s.xuehao =2016;
         s.setAge(20);
         System.out.println(s.age);
         System.out.println(s.name);
         System.out.println(s.gender);
         System.out.println(s.xuehao);
         s.study();
         s.dohomework();
     }
}
