package cn.azuray.Algorithm;

/**
 * 快速排序
 */
public class QuickSort {

    public static int[] quickSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int key = arr[0];
            if (key < arr[i]) {

            }

            for (int j = arr.length - 1; j > 0; j--) {
                if (key > arr[j]) {
                    arr[i] = arr[j];
                    arr[j] = key;
                }
            }
        }

        return arr;
    }

    public static void quickSort2(int[] arr, int start, int end) {
        if (start > end) {
            return;
        }
        int i = start;
        int j = end;
        int key = arr[start];
        while (i != j) {
            while (key <= arr[j] && i < j) {
                j--;
            }
            while (key >= arr[i] && i < j) {
                i++;
            }

            if (i < j) {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }

        }
        arr[start] = arr[i];
        arr[i] = key;
        quickSort2(arr, start, i - 1);
        quickSort2(arr, i + 1, end);
    }


    public static void main(String[] args) {
        int[] arr = new int[]{10, 2, 7, 3, 8, 1};
        QuickSort.quickSort2(arr, 0, 5);
        for (int anInt : arr) {
            System.out.println(anInt);
        }

    }
}
