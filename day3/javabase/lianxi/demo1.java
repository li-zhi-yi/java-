package day3.javabase.lianxi;

/*
练习 给出一个三位数  198
打印出它的百位  十位 个位
*/
public class demo1 {
    public static void main(String[] args) {
        int num = 198;

        // 我写的
        // int bai=num/100;
        // int shi=(num-bai*100)/10;
        // int ge=(num-bai*100-shi*10);
        // 尚硅谷代码
        int bai = num / 100;
        int shi = num % 100 / 10;
        int ge = num % 10;
        System.out.println(bai);
        System.out.println(shi);
        System.out.println(ge);
    }
}
