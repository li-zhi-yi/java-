package day2.javabase;

/*
基本数据类型之间的运算规则
前提：这里讨论的时7中基本数据类型变量间的运算 不包含boolean类型
1 自动类型提升:
    结论：当容量小的数据类型的变量与容量大的数据类型的白能量做运算时，结果自动提升为容量大的数据类型
    byte ,char,short --> int--> long--> float--> double
    特别的：当byte,short ,char这三种变量类型做运算的时候;结果是int类型变量
2 强制类型转换： 见VaribalbeTest4.java
    说明： 此时的容量大小指的是，表示数的范围的大和小。如float容量要大于long的容量
*/
public class VariableTest3 {
    public static void main(String[] args) {
        byte b1 = 2;
        int i1 = 12;
        // byte b2=i1+b1;//错误: 不兼容的类型: 从int转换到byte可能会有损失
        int b2 = i1 + b1;
        long l1 = b1 + i1;

        System.out.println(b2);// 14

        float f = b1 + i1;
        System.out.println(f);// 14.0;

        short s1 = 123;
        double d1 = s1;
        System.out.print(d1);// 123.0;

        // ************************ */
        char c1 = 'a';// 97 ascll码
        int i3 = 10;
        int i4 = c1 + i3;
        System.out.println(i4);

        short s2 = 10;
        // char c2=c1+s2;//编译不通过

        byte b3 = 10;
        // char c3=c1+b3;//编译不通过

        // short s3=b1+b2;编译不通过

    }
}
