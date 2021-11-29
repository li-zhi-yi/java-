/*
break  和continue 关键字的使用

break： 结束当前的循环体 

return  ：并非专门用于结束循环的，它的功能是结束一个方法的，当一个方法执行到return语句时，这个方法将被结束

与break和continue不同的是return直接结束真个方法,不管这个return处于多少层循环之内;
*/
public class Test12{
    public static void main(String[] args) {
        for(int i=2;i<=10;i++){
            if(i%4===0){
                break;//123
                // continue;//123567910
            }
            System.out.println(i);
        }
    }
}