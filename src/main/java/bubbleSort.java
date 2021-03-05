/**
 * 冒泡排序
 */
public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[]{-1, -10, 0, 1, 2, 3, 4, 5, 6, 8, 99, 999}
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] > arr[j + 1]) {
                    int temp = arr[i];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "\t");

        }
    }

}

