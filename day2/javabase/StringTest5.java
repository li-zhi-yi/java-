package day2.javabase;
/*
String 类型变量的使用
1 String 属于引用数据类型
2 声明String类型变量时，使用一对""
3 Strign可以和8中基本数据类型变量做运算,且只能是连接运算符：+
4 运算的接口仍然是String类型
*/
public class StringTest5 {
    public static void main(String[] args){
        String s1="Hello world!";

        System.out.println(s1);

        String s2="a";
        String s3="";

        // char c=''; 编译不通过

        //************************* 
        int number=100;
        String numStr="学号：";
        String info=numStr+number;
        boolean b1=true;
        String info1=info+b1;//链接运算
        System.out.println(info1);


        //************************* 
        //练习1
        char c='a';//ascll码  a 97  A 65
        int  num=10;
        String str="hello";
        System.out.println(c+num+str);//107hello
        System.out.println(c+str+num);//ahello10
        System.out.println(c+(num+str));//a10hell
        System.out.println((c+num)+str);//107hello
        System.out.println(str+num+c);//hello10a

        //剩下练习题 见img String练习题15

        // String str1=123;//编译不通过
        String str1=123+"";//"123"

        //int num1=str1;
        // int num1=(int)str1;//编译不通过 String 不可以转换成int
       
        //借助标桩类Integer中的priseInt()
        int num1=Integer.parseInt(str1);
        System.out.println(str1);//123
    }
}
