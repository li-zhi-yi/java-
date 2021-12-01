/*
一 数组的概率
1数组Array ，是多个相同类型数据按一定顺序排列的结婚，并使用一个名字命名，
并通过编号的方式对这些数据进行统一管理

2 数组相关的概念
数组名
元素
角标、下标、索引
数组的长度

3 数组的特点，
  3.1数组是有序排列的
  3.2数组属于引用类型的变量。数组的元素既可以是基本类型也可以是引用类型
  3.3创造数组对象会在内存中开辟一整块连续的空间
  3.4 数组的长度一旦确定，就不能修改

4 数组的分类
  4.1  按照维数。一维数组，二维数组。。。。。
  4.2  按照数组元素的类型：基本数据类型的数组、引用数据类型元素的数组

5  一维数组的使用
    5.1  一维数组的声明和初始化
    5.2  如何调用数组的指定位置的元素
    5.3  如何获取数组的长度
    5.4  如何遍历数组
    5.5  数组元素的默认初始值
    5.6  数组的内存解析
*/
public class Test1 {
    public static void main(String[] args) {
        //1 一维数组的什么与初始化
        int num;//声明
        num=10;//初始化
        int id=1001;//声明+初始化

        int[] ids;//声明整型类型的数组
        //1.1 静态初始化:数组的初始化和数组元素的赋值炒作同时进行
        ids=new int[]{1001,1002,1003};
        System.out.println(ids); 
        System.out.println(id); 
        System.out.println(num); 
        //1.2 动态初始化：数组的初始化和数组元素的赋值操作分开进行
        String[] names=new String[4];

        //总结： 数组一旦初始化完成，其长度也就确定了

        //2 如何调用数组的指定位置的元素：通过角标的方式调用
        // 数组的角标（索引）从0开始 到数组长度-1结束
        names[0]="张三";
        names[1]="李四";
        names[2]="王老五";
        names[3]="赵六";

        //3  如何获取数组的长度
        //属性 length
        System.out.println(names.length);//4

        //4 如何遍历数组
        /*
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
        */
        for(int i=0;i<names.length;i++){
            System.out.println(names[i]);
        }

        //5  数组元素的默认初始值
        /*
         数组元素的默认初始值
            数组元素是基本数据类型时：
                    》数组元素是整型：0 
                    》数组元素是浮点型：0.0 
                    》数组元素是char型：0或'\u0000',而非'0' 
                    》数组元素是boolean型：false

            
            数组元素是引用数据类型时：
                    null
        */

        int[] arr=new int[4];
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);// 4个 0
        }

        System.out.println("****************");

        short[] arr1=new short[4];
        for(int i=0;i<arr1.length;i++){
            System.out.println(arr1[i]);// 4个 0
        }

        System.out.println("****************");

        float[] arr2=new float[4];
        for(int i=0;i<arr2.length;i++){
            System.out.println(arr2[i]);// 4个 0.0
        }

        System.out.println("****************");

        char[] arr3=new char[4];
        for(int i=0;i<arr3.length;i++){
            System.out.println(arr3[i]);// 4个 0是ascll'\u0000'
        }

        System.out.println("****************");

        boolean[] arr4=new boolean[4];
        for(int i=0;i<arr4.length;i++){
            System.out.println(arr4[i]);// 4个 false
        }

        System.out.println("****************");

        String[] arr5=new String[4];
        System.out.println(arr5[0]);
        if(arr5[0]==null){
            System.out.println("北京天气不错");
        }
    }
}
