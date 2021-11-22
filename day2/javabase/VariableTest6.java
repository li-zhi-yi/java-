package day2.javabase;

/*
计算机中不同进制的使用说明
 对于整数，有四种表示方式
 二进制(binary):0，1 ,满2进1,以0b或0B开头。
 八进制(decimal):0,9,满10进1.
 十进制(octal):0-7
 十六进制(hex):0-9及A-F,满16进1,以0x或0X开头表示；此次A-F不区分大小写;
 如：ox21AF+1=oXx1B0;
*/

public class VariableTest6 {
    public static void main(String[] args) {
        int num1 = 0b110;
        int num2 = 110;
        int num3 = 0127;
        int num4 = 0x110A;

        System.out.println("num1= :" + num1);
        System.out.println("num2= :" + num2);
        System.out.println("num3= :" + num3);
        System.out.println("num4= :" + num4);
    }
}
