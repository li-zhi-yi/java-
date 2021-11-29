package day3.javabase;

/*
do-while 循环的使用
一 循环结构的4个要素
    1初始化条件
    2循环条件
    3循环体
    4迭代条件
二 do-while循环的结构
1
do{
   3 
   4
}while(2)
执行过程  1 3 4 2 3 4 2.。。。。2

说明：
do-while 循环 至少会执行一次循环体
*/
import java.util.Scanner;
public class Test11 {
    public static void main(String[] args) {
        //便利100以内的偶数 并求和
        int num=0;
        int sum=0;
        do{
            if(num%2==0){
                sum+=num;
            }
            num++;
        }while(num<100);
        System.out.println(sum);


        // 从键盘读书个数不确定的 整数，并判断读入的正数和负数的个数 输入0 推出
        Scanner scan=new Scanner(System.in);
        int positiveNumber=0;//记录正数的个数
        int negativeNumber=0;//记录负数的个数
        // 用for循环写
        for(;;){
        //用while写
        // while(true){
            int number=scan.nextInt();

            //判断number的正负情况
            if(number>0){
                positiveNumber++;
            }else if(number<0){
                negativeNumber++;
            }else{
                //一旦执行break 就会跳出当前循环
                break;
            }
        }
        System.out.println("输入整数个数为:"+positiveNumber+"输入负数个数为："+negativeNumber);
        


        /*
        100以内的所有质数的输出
        质数：素数，只能被1和它本身整除的自然数--》从2开始 到这个数结束为止
        */
        for(int i=2;i<=100;i++){
            for(int j=2;j<i;j++){
                if(i%j!=0){
                    System.out.println(i);
                }
            }
        }
    }
}
