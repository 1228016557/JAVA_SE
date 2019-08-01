package day07;

public class day07_01_PhoneDemo {
    public static void main(String[] args) {
        day07_01_phone p = new day07_01_phone();
          p.brand ="苹果";
          p.price = 9999;
        System.out.println("品牌"+p.brand+"价格:"+p.price);
        p.call();
        p.sendMessage();
    }
}
