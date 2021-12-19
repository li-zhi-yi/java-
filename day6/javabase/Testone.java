public class Testone {
    public static void main(String[] args) {
        Catone one = new Catone();
        Catone two = new Catone();
    }
}

class Catone {
    //执行顺序   静态代码块最先执行--->代码块执行--->构造方法执行
    //多次实例化对象  静态代码块只执行一次  代码块和构造方法会执行多次
    // 无参构造方法
    public Catone() {
        System.out.println("我是无参构造方法一");
    }

    //构造代码块
    {
        System.out.println("我是构造代码块二");
    }

    //静态构造代码块
    static {
        System.out.println("我是静态构造代码块三");
    }
}