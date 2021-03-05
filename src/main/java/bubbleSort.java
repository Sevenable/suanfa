package src.main.java;

import java.util.Arrays;

/**
 * 冒泡排序
 * 冒泡排序之前的序列：
 * [-1000, -999, -100, 2, 5, 13, 888, 1999, 20000]
 * 排序后的序列：
 * [-1000, -999, -100, 2, 5, 13, 888, 1999, 20000]
 * [-1000, -999, -100, 2, 5, 13, 888, 1999, 20000]
 * [-1000, -999, -100, 2, 5, 13, 888, 1999, 20000]
 * [-1000, -999, -100, 2, 5, 13, 888, 1999, 20000]
 * [-1000, -999, -100, 2, 5, 13, 888, 1999, 20000]
 * [-1000, -999, -100, 2, 5, 13, 888, 1999, 20000]
 * [-1000, -999, -100, 2, 5, 13, 888, 1999, 20000]
 * [-1000, -999, -100, 2, 5, 13, 888, 1999, 20000]
 *
 *
 *
 *
 * \b 退格符 (Backspace)
 * \t 水平制表符 (相当于tab，缩进)
 * \n 换行符
 * \f 换页符
 * \r 回车符
 * \"	转义"
 * \\转义\
 */
public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[]{-100, -999, 13, 2, 5, 888, 1999, 20000, -1000};
        //冒泡排序
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        //遍历
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();

        System.out.println("冒泡排序之前的序列：");
        System.out.println(Arrays.toString(arr));   //数组的方法，将数组转换成字符串

        System.out.println("排序后的序列：");

        //冒泡排序算法
        int temp = 0;
        //根据(1)中的代码，我们知道了，我们一共执行了arr.length-1趟的排序，并且，在我们的小循环中，每次执行排序的元素的个数是arr.length-1-i
        //这样我们就可以把两者结合，得到如下的冒泡排序的算法
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            System.out.println(Arrays.toString(arr));
        }


    }


//public static void main(String[] args) {


//}

}

