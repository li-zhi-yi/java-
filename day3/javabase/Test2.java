package day3.javabase;

/*
赋值运算符
符号：
= 赋值
+=
-=
*=
/=
%=
扩展赋值运算符
*/
public class Test2 {
   public static void main(String[] args){
       //赋值符号 ：=
       int i1=10;
       int j1=10;
       int i2,j2;
       //连续赋值
       i2=j2=10;

       int i3=10,j3=20;

       //********************* */
       int num1=10;
       num1+=2;//num1=mun1+2;
       System.out.println(num1);//10

       int num2=12;
       num2%=5;//num2=num2%5;
       System.out.println(num2);//2

       short s1=10;
       //s1=s1+10;//会改变本身的数据类型 编译失败  10 int 类型  生成short 大变小
       s1+=2;//不会改变本身的数据类型
       System.out.println(s1);//12


       //开发中 如果希望变量实现+2的操作，有几种方法？前提 int num=10;
       //方式   1  int num=num+2;
       //方式   2  int num+=2;


          //开发中 如果希望变量实现+1的操作，有几种方法？前提 int num=10;
       //方式   1  int num=num+1;
       //方式   2  int num+=1;
       //方式   3  int num++或 int ++num  (不设计运算 前++ 后++一样) 推荐

   } 
}
