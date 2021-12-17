import java.lang.reflect.Array;

public class Cat{
    //成员属性:昵称,年龄,体重,品种
    String name;
    int month;
    double weight;
    String species;

    //构造方法
    //无参构造方法
    public Cat(){
        System.out.println("我是无参的构造方法");
    }

    // public Cat(String name){
    //     System.out.println("我是带参构造方法");
    // }

    public Cat(String name,int month,double weight,String species){
        this();//我们可以通过this()的方式在带参构造中调用无参构造的方法
        this.name=name;
        this.month=month;
        this.weight=weight;
        this.species=species;
        this.eat();
    }

    //方法 
    public void run(){
        System.out.println("Cat can run");
    }

    public void eat(){
        System.out.println(this.name+"Cat can eat food");
    }
}