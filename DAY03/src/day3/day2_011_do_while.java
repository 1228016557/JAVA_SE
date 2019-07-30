package day3;
   /*
   需求:输出5词helloworld.
   do while 格式:
     初始化语句;
     do{
     循环体语句;
     条件控制语句;
     }while(条件判断语句);

    */
public class day2_011_do_while {
       public static void main(String[] args) {
           int i=1;
           do {
               System.out.println("helloworld");
           i++;
           }while (i<=5);
       }

}
