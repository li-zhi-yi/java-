package day3.javabase;

/*
比较运算符
==
!=
>
<
>=
<=
instanceof
结论：
1比较运算符的结果时boolean类型

*/
public class Test3 {
    public static void main(String[] args){
        int i=10;
        int j=20;

        System.out.println(i==j);//false
        System.out.println(i=j);//20

        boolean b1=true;
        boolean b2=false;
        System.out.println(b2==b1);//fasle
        System.out.println(b2=b1);//true
    }
}
