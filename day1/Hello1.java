package day1;

/*
对第一个java程序进行总结  
1 java程序编写-编译-运行的过程
编写 ：我们将编写的java代码保存在以'.java'结尾的文件中
编译：使用javac.exe 命令对我们编写的'.java'源文件进行编译。 格式：javac  源文件名.java
运行: 使用java.exe 命令解释运行我们的字节码文件。 格式：java 类名
一个java 文件中可以有多个类 但是只有一个

2  在一个java源文件中可以声明多个class 。 但是，只能最多有一个类声明为public的
public 的类的类名必须与源文件名相同

3 程序的入口是main()方法，格式是固定的

4  输出语句
System.out.println(); //先输出，然后换行
System.out.print();   //输出后不换行

5  每一行执行语句都以';'结束

6  编译的过程:编译后会生成 一个或多个字节码文件。字节码文件的文件名与java源文件中的类名相同

*/
public class Hello1 {

    /*
     * 三种写法 推荐最下面的那种 public static void main(String a) {}
     *  public static void main(String a[]) {}
     *  public static void main(String[] args) {} //推荐
     */
    public static void main(String[] args) {
        System.out.print("hello world");
        System.out.println("hello world");
        System.out.print("hello world");
    }
}

class Animal {
    
}

class Person {

}