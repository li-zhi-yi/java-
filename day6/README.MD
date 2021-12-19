package com.imooc.test;//定义包
import com.imooc.animal.* //加载com.imooc.animal下所有类
import com.imooc.animal.Cat;// 加载com.imooc.animal下的Cat 类

//static + 属性  ==>类属性,静态属性
//static + 方法  ==>类方法,静态方法
访问静态成员的两种方式
1 对象.成员
2 类.成员

//static :静态  静态成员,类成员   该类的所有实例都公用同一个静态存储空间

public  static void eat(){
//静态方法中不能直接访问非同一个类的非静态成员,只能直接调用同一个类中的静态成员
//如果非要调用 必须实例化类 通过对象.成员方法的访问非静态成员
Cat temp =new Cat();
temp.run();
tem.name="小胖";//静态方法中不能使用this
price=1500;
System.out.println("小猫吃鱼");
}



{} 代码块  

普通代码块:顺序执行,先出现,先执行 (存在方法中)
构造代码块:创建对象时调用,优先于构造方法执行(存在与类中)
静态代码块:创建对象时调用,优先于构造代码块执行(存在与类中,构造代码块前面加上static)
