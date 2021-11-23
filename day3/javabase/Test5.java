package day3.javabase;

/*
位运算符
结论
1  为运算符的操作都是整型的数据
2 <<： 在一定范围内，每想左移1位，相当于*2
2 >>： 在一定范围内，每想右移1位，相当于/2

面试题：最搞笑方式计算2*8？ 2<<3 或 8 <<1
*/
public class Test5 {
    public static void main(String[] args){
        int i=21;
        // i=-21;
        System.out.println("i << 2"+(i << 2));
        System.out.println("i << 3"+(i << 3));
        System.out.println("i << 27"+(i << 3));


        int m=12;
        int n=5;
        System.out.println("m & n :"+ (m & n));//4
        System.out.println("m | n :"+ (m | n));//13
        System.out.println("m ^ n :"+ (m ^ n));//9


        //练习  交换两个变量的值
        int num1=10;
        int num2=20;


        //方式一： 定义临时变量的方式
        //推荐
        // int tmp=num1;
        // num1=num2;
        // num2=tmp;


        //方式二：好处 ：不用定义临时变量
        //弊端  相加操作可能你超出存储范围 2  局限性 只能适用于数值类型
        // num1=num1+num2;
        // num2=num1-num2;
        // num1=num1-num2;


        //方式三：使用位运算符
        //有局限性  只能适用于数值类型
        num1=num1^num2;
        num2=num1^num2;
        num1=num1^num2;
    }
}
