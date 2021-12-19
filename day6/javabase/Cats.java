
/*
关键字
public  公共的
private 私人的


*/
public class Cats {
    // 定义属性
    private String name;// private 限定只能在当前类内访问
    int month;
    double weight;

    // 定义有参的构造方法
    public Cats(String name, int month, double weight) {
        // 可以使用this()调用无参构造方法 但是必须放在第一个位置
        // 给属性赋值
        this.name = name;
        this.month = month;
        this.weight = weight;

    }

    // 创建公共的方法
    // 设置属性
    public void setName(String name) {
        this.name = name;
    }

    // 获得属性
    public String getName() {
        return "我是一只叫" + this.name + "的宠物喵";
    }

    public int getMonth() {
        return this.month;
    }
    
    public void setMonth(int month) {
        if(month<=0){
            System.out.println("月份输入国小");
        }else{
            this.month=month;
        }
    }


    //静态成员
    static int price=150;

    //静态方法
    public static void eat(){
        
    }
}