import java.util.Arrays;

/*
java.util.Arrays:操作数组的工具类,里面定义了很多操作数组的方法


*/
public class Test5 {
    public static void main(String[] args) {
        // 1. Arrays.equals(int[] a, int[] b);判断两个数组是否相等
        int[] arr1=new int[]{1,2,3,4};
        int[] arr2=new int[]{1,2,3,4};
        int[] arr3=new int[]{1,2,4,3};
        boolean isEquals=Arrays.equals(arr1,arr2);
        System.out.println(isEquals);//true

        // 2. Arrays.toString(int[] a);输出数组信息
        System.out.println(Arrays.toString(arr1));//[1,2,3,4]

        // 3. Arrays.fill(int[] a,int val);//讲指定值填充到数组之中替换数组中原来的值
        Arrays.fill(arr1,10);
        System.out.println(Arrays.toString(arr1));//[10,10,10,10]

        // 4. Arrays.sort(int[] a);//对数组镜像排序
        Arrays.sort(arr3);
        System.out.println(Arrays.toString(arr3));//[1, 2, 3, 4]
        // 5 int binarySearch(int[] a,int key);对排序后的数组镜像二分检索指定的值的索引
           int[] arr4 = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9,11, 10 };
           int index=Arrays.binarySearch(arr4,9);
           System.out.println(index);//8

    }
}