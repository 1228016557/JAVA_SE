package DAY06;

import javax.sound.midi.Soundbank;

/*
百钱百鸡
  需求：鸡翁五文钱一个，母鸡三文钱一个，鸡雏一文钱三个，用一百文钱买一百只鸡
  ，问鸡翁，母鸡和鸡雏的个数分别是？
 */
public class day06_04_biaqianbaiji {
    public static void main(String[] args) {
        //1.用第一层循环来判断鸡翁的个数（0<=鸡翁<=20）
        for (int x= 0;x<=20;x++){
            //2.判断母鸡的个数
            for (int y = 0; y <=33 ; y++) {
                //这个时候鸡雏的个数是z=100-x-y
                int z = 100-x-y;
              if (z%3==0&&5*x+3*y+z/3==100){
                  System.out.println("鸡翁"+x);
                  System.out.println("母鸡"+y);
                  System.out.println("鸡雏"+z);
                  System.out.println("----------");
              }
            }
            
            
        }
        
    }
}
