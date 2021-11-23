package day3.javabase;

/*
三元运算符
1 结构  (条件表达式)?表达式1：表达式2；
2  说明
    条件表达式的结果是boolean类型
    条件表达式为真 执行表达式1 ,否则执行表达式2

    表达式1和表达式2的类型要求是一致的
3 凡是可以使用三元运算符的 都可以改写成if-else 条件语句
    能用if-else写的 不一定可以改写成三元运算符

4  如果程序员既可以使用三元运算符，又可以使用if-else结构，那么选择三元运算符；(原因：简洁，执行效率高)
*/
public class Test6 {
    public static void main(String[] args) {
        // 获取两个整数的最大值
        int num1 = 10;
        int num2 = 102;
        double max = (num1 >= num2) ? num1 : num2;
        System.out.println(max);// 102.0
    }
}
