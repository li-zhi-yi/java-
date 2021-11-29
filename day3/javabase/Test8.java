package day3.javabase;

/*
    分支结构之二:switch-case
    switch(表达式){
        case 常量1：
        执行语句1；
        breake;
     case 常量1：
        执行语句1；
        breake;
     case 常量2：
        执行语句2；
        breake;
        .......

        //都不执行 执行默认语句
        default：
            执行语句n；
            breake;
    }

    2 说明 
        2.1 更具switch表达式中的值，依次匹配case中的值，匹配仇工则执行对应语句
        当调用完成语句后 如果遇到break 则终止执行  如果没有break 则继续执行
        2.2 关键字 break 在switch-case 中 遇到break后则终止 跳出条件语句
        2.3  switch结构中的表达式，只能是如下6种数据结构类型之1
        byt ,short,char,int,枚举类型(JDK5.0新增)，String类型(JDK7.0新增)
        2.4  case 之后能能声明常量。不能声明范围
        2.5 defalut 相当于if-else中的else  默认
*/
public class Test8 {
    public static void main(String[] args) {
        int number = 2;
        switch (number) {
        case 0:
            System.out.println("zero");
            break;
        case 1:
            System.out.println("one");
            break;
        case 2:
            System.out.println("two");
            break;
        default:
            System.out.println("other");
        }
    }
}
