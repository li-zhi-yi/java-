/*
二维数组的使用
1 理解  
对于二位数组的理解<我们可以堪称是i以为数组array1作为另一个数组array2的元素而存在.
其实,从数组底层的运行机制来看,其实没有多为数组.



2 二维数组的使用
    2.1 二维数组的声明和初始化
    2.2 如何调用数组的指定位置的元三年
    2.3 如何获取数组的长度
    2.4 如何遍历数组
    2.5 数组元素的默认初始值
    2.6 数组的内存解析
*/
public class Test2 {
    public static void main(String[] args) {
        // 1 二维数组的声明和初始化
        int[] arr = new int[] { 1, 2, 3 };// 一维数组
        // 也可以这样写 利用了类型推断
        int[] arrOne = { 1, 2, 3 };
        // 二维数组的静态初始化
        int[][] arr1 = new int[][] { { 1, 2, 3 }, { 4, 5 }, { 6, 8 } };
        // 动态初始化
        String[][] arr2 = new String[3][2];
        String[][] arr3 = new String[3][];

        // 2 如何调用数组的指定位置的元素
        System.out.println(arr1[0][1]);// 2
        System.out.println(arr2[1][1]);// null

        arr3[0] = new String[4];
        // System.out.println(arr3[1][0]);

        // 3获取数组的长度 length
        System.out.println(arr1.length);

        // 4 如何获取遍历二维数组
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; i++) {
                System.out.println(arr1[i][j]);
            }
        }

        // 5 数组元素的默认初始值
        /*
         * 二维数组分为外出数组元素,
         * 内层数组的元素 int[][] arr=new int[4][3]; 
         * 外层元素 :arr[0],arr[1] 
         * 内层元素:arr[0][1],arr[1][2] 
         * 针对初始化方式一:比如 int[][] arr=new int[4][3]; 外层元素的初始值为: 地址值
         * 内层元素的初始值为:与一维数组初始化情况相同
         * 
         * 针对初始化方式二:比如 int[][] arr=new int[4][3]; 外层元素的初始值为:null 内层元素的初始值为:不能调用,否则报错
         */
        int[][] arr5 = new int[4][3];
        System.out.println("-------------------");
        System.out.println(arr5[0]);// 一个地址[I@15db9742
        System.out.println(arr5[0][0]);// [[I@6d06d9c]]

        double[][] arr6 = new double[4][];
        System.out.println(arr6[1]);// 地址值
        // System.out.println(arr6[3][0]);// 空指针异常 报错
    }
}