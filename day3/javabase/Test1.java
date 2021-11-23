package day3.javabase;

/*
运算符:算术运算符
+ 加
— 减
* 乘
/ 除
% 取模
++a 前++  先++后运算
a++ 后++  运算完毕后 在+1
--a 前--  先--后运算
a-- 后--  运算后  在-1
*/
public class Test1 {
    public static void main(String[] args) {

        int num1 = 12;
        int num2 = 2;
        int result1 = num1 / num2;
        System.out.println(result1);// 6

        int result2 = num1 / num2 * num2;
        System.out.println(result2);// 12

        double result3 = num1 / num2 * num2;
        System.out.println(result3);// 12.0

        // % 取模
        // 结果符号与被魔术的符号相同
        // 开发中，经常使用%来判断能否被除尽的情况
        int m1 = 12;
        int n1 = 5;
        System.out.println("m1%n2: " + m1 % n1);

        int m2 = -12;
        int n2 = -5;
        System.out.println("m1%n2: " + m2 % n2);

        int m3 = 12;
        int n3 = -5;
        System.out.println("m1%n2: " + m3 % n3);

        int m4 = -12;
        int n4 = -5;
        System.out.println("m1%n2: " + m4 % n4);

        /*
          ++a 前++ 先++后运算
          a++ 后++ 运算完毕后 在+1 
          --a 前-- 先--后运算 
          a-- 后-- 运算后 在-1
         */
        int a1=10;
        int b1=++a1;//11

        int a2=10;
        int b2=a2++;//10

        int a3=10;
        int b3=--a3;//9

        int a4=10;
        int b4=a4--;//10

        // 注意点
        short s1=10;
        // s1=s1+1;//编译失败  1时整型 int   整型int 转换成 short 编译失败
        // s1=(short)(s1+1);//强制转换
        s1++;//自增1不会该百年本身变量的数据类型；
    }
}
