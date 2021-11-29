/*
一个属如果下好等于它的因子之和，这个数就是婉媚术
列入 6=1+2+3
*/
public class Test13 {
    public static void main(String[] args) {
        //完美术
        int count=0;
        for(int i=1;i<=1000;i++){
            for(int j=1;j<i/2;j++){
                if(i%j==0){
                    count+=j;
                }
            }
            if(i==count){
                System.out.println(i)
            }
            //重置
            count=0;
        }
    }
}