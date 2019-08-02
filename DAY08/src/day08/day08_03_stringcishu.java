package day08;

import java.util.Scanner;

/*
键盘录入一个字符串，统计该字符串中大写字母字符，小写字母字符，数字字符出现的次数(不考虑其他字符)
   1:键盘录入一个字符串，用 Scanner 实现      
  2:要统计三种类型的字符个数，需定义三个统计变量，初始值都为0  
      3:遍历字符串，得到每一个字符    
    4:判断该字符属于哪种类型，然后对应类型的统计变量+1
 */
public class day08_03_stringcishu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个字符串");
        String line =   sc.nextLine();

        int bignumber =0;
        int smallnumber = 0;
        int  numbercount = 0;

        for (int i = 0;i<line.length();i++){
             char ch = line.charAt(i);
          if (ch>='a'&&ch<='z'){
              smallnumber++;
          }
          else if (ch>='A'&&ch<='Z'){
              bignumber++;
          }else if(ch>='0'&&ch<='9'){
              numbercount++;
            }


        }
        System.out.println("小写字母有:"+smallnumber+"个");
        System.out.println("大写字母有:"+bignumber+"个");
        System.out.println("数字有:"+numbercount+"个");

    }

}
