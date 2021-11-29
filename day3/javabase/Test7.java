package day3.javabase;
/*
分支结构中的if-else(条件判断结构)
一，三结构
第一种
if(条件表达式){
    执行表达式
}

第二种
if(条件表达式){
    执行表达式1
}else{
    执行表达式2
}
第三种
if(条件表达式){
    执行表达式1
}else if(条件表达式){
    执行表达式2
}else{
    执行表达式3
}
*/

public class Test7 {
    public static void main(String[] args) {
        // 举例一
        int heartBeats = 80;
        if (heartBeats < 70 || heartBeats > 100) {
            System.out.println("心跳不正常");
        }

        // 举例二
        int age = 23;
        if (age < 18) {
            System.out.println("你还没成年");
        } else {
            System.out.println("你已经成年");
        }

        // 举例三
        if (age <= 18 && age > 0) {
            System.out.println("你还没成年");
        } else if (age <= 35 && age > 18) {
            System.out.println("你已经成年,切是年轻人");
        } else if (age > 35 && age <= 65) {
            System.out.println("你已经成年,切是中年人");
        } else if (age > 65 && age <= 120) {
            System.out.println("你已经成年,切是老年人");
        }else{
            System.out.println("输入不合法");
        }
    }
}
