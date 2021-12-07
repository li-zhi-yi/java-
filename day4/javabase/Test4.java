/*
冒泡排序
*/
public class Test4 {
    public static void main(String[] args) {

        int[] arr = new int[]{ 1, 2, 4, 67, 8, 889, 4, 3989, 776 };
        System.out.println(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[i] > arr[j]) {
                    int result = arr[j];
                    arr[j] = arr[i];
                    arr[i] = result;
                }
            }
        }
        System.out.println(arr);
    }
}