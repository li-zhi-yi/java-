package day3.javabase;

/*
while 循环的使用
一 循环结构的4个要素
    1初始化条件
    2循环条件
    3循环体
    4迭代条件
二 while循环的结构
1
while(2){
    3
    4
}
执行过程
1 2 3 4 2 3 4 ....2

说明
写while 循环千万不能丢了迭代条件 ，没写 就死循环
for循环和while循环时可以相互转换的

算法 有限性

*/
public class Test10 {
    public static void main(String[] args){
        //便利100以内的所有偶数
        int i=0;
        while(i<100){
            if(i%2==0){
                System.out.println(i);
            }
            i++;
        };

    }
}
