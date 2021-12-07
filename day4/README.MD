1 写出一维数组初始化的两种方式
 int[] arr=new int[]{1,2,3};//静态初始化
 int[] arr1=new int[3];//动态初始化

数组一旦初始化,起长度是确定的.   arr.length
数组长度一段确定,就不可以修改;

2 写出二维数组初始化的两种方式
int[][] arr=new int[][]{{1,2,3},{4,5}};//静态初始化
//动态初始化两种
int[][] arr1=new int[3][2];
int[][] arr2=new int[3][];

3 如何遍历如下二维数组
int arr[][] arr=new int[][]{{1,2,3},{4,5}};
for(int i=0;i<arr.length;i++){
    for(int j=0;j<arr[i].length;j++){
        System.out.println(arr[i][j])
    }
}

4 不同类型的一维数组元素的默认初始值各是多少
//基础类型
int[] arr=new int[5];//0
float[] arr=new float[5];//0.0
double[] arr=new double[5];//0.00
char[] arr=new char[5];//0 是 \u000 ASCLL字符码
boolean[] arr=new boolean[5];//false
//引用类型 null
String[] arr=new String[5];//false


5   数据结构
 1 数据与据之间的逻辑关系:集合,一对一,一对多,多对多
 2 数据的存储结构:
    线性表:顺序表(比如:数组),链表,栈,队列
    树形结构:二叉树
    图形结构:

    算法:
    排序算法:
    搜索算法:

数组中涉及的常见算法
1 数组元素的赋值(杨辉三角,回形数等) 考
2 求数值型数组中元素的最大值,最小值,平均数,总和等
3 数组的复制,反转,查找(线性查找,二分法查找)
4 数组元素的排序算法  比较喜欢考