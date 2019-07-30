package DAY06_2;
/*
百钱百鸡
  需求：鸡翁五文钱一个，母鸡三文钱一个，鸡雏一文钱三个，用一百文钱买一百只鸡
  ，问鸡翁，母鸡和鸡雏的个数分别是？
        x+y+z=100;
        5x+3y+z/3=100;
 */
public class baiqianbaiji {
    public static void main(String[] args) {
        for (int x = 0; x <20 ; x++) {
            for (int y = 0; y <=33 ; y++) {
                int z=100-x-y;
                if (5*x+3*y+z/3==100&&z%3==0){
                    System.out.println(x+","+y+","+z);
                }
            }
        }
    }
}
