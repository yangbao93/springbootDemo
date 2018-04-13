package cn.azuray.Algorithm;

/**
 * 插入排序
 */
public class InsertSort {

    public static int[] insertSort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else {
                    break;
                }
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{4, 1, 9, 5, 2};
        int[] ints = InsertSort.insertSort(arr);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }
}
