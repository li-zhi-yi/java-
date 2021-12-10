/*
方法:描述类应该具有的功能
比如:Math类 :sqrt()\random()\....
比如 Scannar类,nextXxx()...
比如Arrays类,sort(),binarySearch(),toString()


1 举例
 public void eat(){};
 public void sleep(int hour){};
 public Stirng getName(){return name;};
 public Stirng getNation(){return nation;};

 2 方法的声明: 权限修饰符  返回值类型  返回值类型 方法名(形参列表){
     方法体
 }

 注意: static ,final,abstract 修饰的方法 后面再将;  

 3  说明:
    3.1 关于权限修饰符  :默认方法的权限修饰符先使用public
       Java 规定的4种权限修饰符 private,public,缺省,protected  --->封装性 在细说

    3.2  返回值类型:有返回值 VS 没有返回值
        3.2.1 如果方法又返回值,则必须在方法声明中指定返回值的类型,同时方法中需要使用return关键字返回指定类型的变量或常量;

            如果方法没有返回值,则方法声明时使用void来表示,通常没有返回值的方法中就不适用return,但是,如果使用的话,只能"return",表示结束此方法的意思;

        3.2.2  我们定义方法该不该又返回值?
            1  题目要求
            2  凭经验
        
    3.3  方法名:术语标识符:遵循标识符的规则和规范,'见名知意';

    3.4  形参列表:  方法名可以声明0个 或多个形参;
        3.4.1 格式  : 数据类型1 形参1, 数据类型2 形参2,

        3.4.2  我们定义方法时,该不该定义形参
            1  题目要求
            2  凭经验
    
    3.5  方法体: 方法功能的体现


   4 return 关键字的使用
        1  使用范围, 使用在方法体中
        2   作用 : 1 结束方法
                   2 正对有返回值类型的方法,使用  return 数据 ;返回索要数据并结束方法
        3   return 关键字后面不可以声明执行语句;

    5  方法的使用:可以调用当前类的属性或方法
            特殊: 方法A中调用方法A  递归
*/
public class Test3 {
    public static void main(String[] args) {
        Customer cust1=new Customer():

        cust1.eat();

        cust1.sleep(8);
    }
}

// 客户类
class Customer {
    // 属性
    String name;
    int age;
    boolean isMale;

    // 方法
    public void eat() {
        System.out.println("吃早饭");
    }

    // void 没有返回值
    public void sleep(int hour) {
        System.out.println("睡觉" + hour + "小时");
        // 可以调用当前类的属性或方法
        eat();
    }

    // String 又返回值 返回值是字符串
    public String getName() {
        return name;
    }

    public String getNation(String nation) {
        String info = "我的国籍是" + nation;
        return info;
    }

}