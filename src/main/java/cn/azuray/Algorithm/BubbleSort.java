package cn.azuray.Algorithm;

/**
 * 冒泡排序法
 */
public class BubbleSort {

    public static int[] bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 4, 2, 6, 19, 10};
        int[] ints = BubbleSort.bubbleSort(arr);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }
}
