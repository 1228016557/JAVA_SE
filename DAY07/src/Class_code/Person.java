package Class_code;
 //人类
public class Person {
   private   String name;
   private int age;
    private   String gender;

    public Person(String name,int age,String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
   public void show(){
       System.out.println(name+age+gender);
   }





}
