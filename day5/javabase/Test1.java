/*
一  设计类,其实就是设计类的成员
属性=成员变量=field=域,字段 (别名)
方法=成员方法=函数=method


创建类的对象=类的实例化=实例化类


二 类和对象的使用(面向对象思想落地的实现)
1 创建类,设计类的成员
2 创建类的对象
3 通过"对象.属性"或"对象.方法"调用对象的结构

三 如果创建了一个类的多个对象,则每个对象都独立用于哦一套类的属性.(非Static的)
意味着 :如果我们修改一个对象的属性a,则不影响另外一个对象属性a的值

四 对象中的类型解析
*/

//测试类
public class Test1 {
    public static void main(String[] args) {
        // 创建Person类的对象
        Person p1 = new Person();
        // 调用对象的结构:属性,方法
        p1.name = "Tom";
        p1.isMale = true;
        System.out.println(p1.name);

        // 调用方法
        p1.eat();
        p1.sleep();
        p1.talk("English");

        // **************************
        Person p2=new Person();
        System.out.println(p2.name);//null
        System.out.println(p2.isMale);//false

        // **************************
        Person p3=p1;
        System.out.println(p3.name);//Tom

        p3.age=10;
        System.out.println(p1.age);//10

    }
}

class Person {
    // 属性
    String name;
    int age = 1;
    boolean isMale;

    // 方法
    public void eat() {
        System.out.println("人可以吃饭");
    }

    public void sleep() {
        System.out.println("人可以睡觉");
    }

    public void talk(String language) {
        System.out.println("人可以说话,使用的是:" + language);
    }

}