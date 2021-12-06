import java.util.*;

public class practiceone {
    public static void main(String[] args) {
        // 使用Scanner读取学生个数
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入学生人数");
        int Num = scan.nextInt();
        // 创建动态数组
        int[] arr = new int[Num];
        int Maxnum = 0;
        // 给数组元素赋值
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt(Num);
            if (Maxnum < arr[i]) {
                Maxnum=arr[i];
            }
        }
        //更具每个学生与最高成绩的插值获取等级
        char result;
        for(int i=0;i<arr.length;i++){
            if(Maxnum-arr[i]<=10){
                result='A';
            }else if(Maxnum-arr[i]<=20){
                result='B';
            }else if(Maxnum-arr[i]<=30){
                result='C';
            }else {
                result='D';
            }
            System.out.println("Student最高分"+ Maxnum );
            System.out.println(result);
        }
    }
}