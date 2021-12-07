/*
算法题的考察:求数值类型数组中元素的 最大值,最小值,平均数,总合等
范围
[10,99]
公式
(int)(Math.random()*(99-10+1)+10)

二分法查找 前提所要查找的数组必须是有序
*/
public class Test3 {
    public static void main(String[] args) {
        // int[] arr = new int[10];
        // int maxValue = 0;
        // int minValue = 0;
        // int sum = 0;
        // for (int i = 0; i < arr.length; i++) {
        // arr[i] = (int) (Math.random() * (99 - 10 + 1) + 10);
        // }
        // // 求最大值 最小值 平均数 综合
        // for (int i = 0; i < arr.length; i++) {
        // if (maxValue < arr[i]) {
        // maxValue = arr[i];
        // }
        // if (minValue > arr[i]) {
        // minValue = arr[i];
        // }
        // sum += arr[i];
        // }
        // System.out
        // .println("最大值:" + maxValue + "----最小值:" + minValue + "----总合:" + sum +
        // "----平均数:" + sum / (arr.length));

        // 二分法 查找数组中是否还有指定元素 有指出位置
        int[] arr1 = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9,11, 10 };
        boolean isFlag = false;
        int searchNum = 7;
        int head = 0;
        int end = arr1.length;
        for (int i = 0; i < arr1.length; i++) {
            int middle = (head + end) / 2;
            if (searchNum == arr1[middle]) {
                isFlag = true;
                System.out.println("指定元素已经找到,索引" + middle);
                break;
            } else if (searchNum > arr1[middle]) {
                head = middle + 1;
            } else {
                end = middle - 1;
            }
        }
        
    }
}