package Class_code;
 //学生类
public class Student {
    String  name; //名字
    int    xuehao; //学号
    String gender;   //性别
     int age ;
   //构造方法
     public  Student(String name ,int age ){
         this.name =name;
         this.age = age;
     }
   //成员方法
     public void setAge( int age){
         this.age = age;
     }
     public  int getAge(){
         return age;
     }

     public  void  study(){
         System.out.println("学习");
     }
     public  void  dohomework(){
         System.out.println("做作业");
     }
}
