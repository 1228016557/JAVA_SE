package day07;

import javax.print.DocFlavor;

//人类
public class day07_02_Person {
     private String name;
     private int age;

     public day07_02_Person(){

     }

     public day07_02_Person(String name ,int age){
         this.name = name;
         this.age =age;
     }

      public void setName( String name){
         this.name =name;
     }
     public  String getName(){
         return name;
     }

     public  void  setAge( int age){
         if (age<0){}else {this.age = age;}

     }
     public  int getAge(){
         return age;
     }

     public  void  show(){
         System.out.println(name+","+age);
     }


}
