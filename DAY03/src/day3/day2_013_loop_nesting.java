package day3;

/*
  循环语句:循环语句中包含循环语句
  需求:
  在控制台输出一天的小时和分钟

  分钟和小时的范围:
  分钟:0<=minute<60
  小时:0<=hour<24
 */
public class day2_013_loop_nesting {
    public static void main(String[] args) {
    //外循环控制小时的范围,内循环控制分钟的循环
        for ( int hour = 0;hour <24;hour++){
            for (int minute = 0;minute<60;minute++){
                System.out.println(hour+"小时"+minute+"分钟");
            }

        }
    }
}
