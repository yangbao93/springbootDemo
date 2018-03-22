package azuray.Algorithm;

/**
 * 冒泡排序法
 */
public class BubbleSort {

    public static int[] bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
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
