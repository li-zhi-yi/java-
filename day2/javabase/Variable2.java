package day2.javabase;

/*
变量的使用
1 java 定义变量的格式：数据类型 变量名=变量值

2 说明
    1 变量必须先声明，后使用
    2 变量都定义在其作用域内。在作用域内，它是有效的。换句话说，除了作用域就失效了
    3 同一个作用域内，不可以声明两个同名的变量

    
3   Java 定义的数据类型

    3.1变量安装数据类型来分
        1基本数据类型
            整型 byte ;short;int ;long;
            浮点型 float ;double
            字符型 char
            布尔型 boolean

        2引用数据类型
            类(class)
            接口(interface)
            数组(array)
       
    3.2  变量在类中声明的位置：
    成员变量  cs 局部变量 （看图）
*/
public class Variable2 {
    public static void main(String[] args) {
        // 定义变量  先定义  在赋值
        int myAge = 12;
        System.out.println(myAge);
        //也可以先定义
        int newYear;
        //后赋值
        newYear = 2021;
        System.out.println(newYear);
    }

}