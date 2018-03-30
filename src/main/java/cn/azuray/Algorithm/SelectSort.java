package cn.azuray.Algorithm;

/**
 * 选择排序
 */
public class SelectSort {

    public static int[] selectSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int tempMin = i;
            int tempMinValue = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < tempMinValue) {
                    tempMinValue = arr[j];
                    tempMin = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[tempMin];
            arr[tempMin] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{5, 1, 2, 6, 3};
        int[] ints = SelectSort.selectSort(arr);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }
}
