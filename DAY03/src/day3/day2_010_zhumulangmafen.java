package day3;

/*
珠穆朗玛峰:
需求:珠穆朗玛峰高8844430毫米,加入我有一张足够大的纸张,它的厚度0.1毫米
请问,折叠多少次,可以折叠成珠穆朗玛峰的高度

*/
public class day2_010_zhumulangmafen {
    public static void main(String[] args) {
        //折叠次数,初始值为0
        int count = 0;
        //定义纸张高度
        double paper = 0.1;
        //定义珠穆朗玛峰的高度
        int zm = 8844430;
        //当纸张高度低于山的高度,继续折叠
        while (paper <= zm) {
            paper *= 2;
            count++;
        }
        System.out.println("折叠的次数:"+count);
        System.out.println("折叠完最后一次的高度:"+paper);
    }
}
