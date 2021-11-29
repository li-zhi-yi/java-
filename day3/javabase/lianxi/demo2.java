package day3.javabase.lianxi;
/*
如何从键盘获取不同类型的变量:需要使用Scanner类

具体实现步骤
1 导包 ：import java.util.Scanner;
2 Scanner的实例化：Sanner scan=new Sanner(System.in);
3 调用Scanner类的 相关方法(next()/nextXxx()),来获取指定类型的变量

注意：
需要根据相应的方法，来输入指定类型的值。如果输入的数据类型与需求的类型不匹配，会报一场：InputMismatchException导致程序终止；
*/

//1 导包
import java.util.Scanner;
public class demo2 {
    public static void main(String[] args) {
        //2 Scanner 实例化
        Scanner scan=new Scanner(System.in);
        //3 调用Scanner类的相关方法
        System.out.println("请输入您的姓名：");
        String name=scan.next();
        System.out.println(name);

        System.out.print("请输入您的年龄:");
        int age=scan.nextInt();
        System.out.println(age);


        System.out.println("请输入您的体重：");
        double weight=scan.nextDouble();
        System.out.println(weight);
    }
}
