package day3.javabase;

/*
For循环结构的使用
一 循环结构的4个要素
    1初始化条件
    2循环条件
    3循环体
    4迭代条件

二  for循环的结构
for(1,2,4){
   3 
}
执行条件  1->2->3>4->2-3-4....2;


break 在循环结构中 使用 就是跳出当前这个循环

*/
public class Test9 {
    public static void main(String[] args) {
        for (int i = 1; i < 5; i++) {
            System.out.println(i);
        }

        // 获取100以内的偶数和
        // int sum = 0;
        // for (int i = 0; i < 100; i++) {
        // if (i % 2 == 0) {
        // System.out.println(i);
        // sum += i;
        // }
        // }
        // System.out.println(sum);

        int a, b, c;
        // break
        for (int i = 100; i < 1000; i++) {
            a = i / 100;
            b = i % 100 / 10;
            c = i % 10;
            if (i == a * a * a + b * b * b + c * c * c) {
                System.out.println(i);
            }
        }
    }
}
