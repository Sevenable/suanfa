
import java.util.Arrays;

public class BubbleSortStep {
    public static void main(String[] args) {
        int[] arr = {3,9,-1,10,-2};
        System.out.println("冒泡排序之前的序列：");
        System.out.println(Arrays.toString(arr));   //数组的方法，将数组转换成字符串
        System.out.println("排序后的序列：");
        //分步骤的排序算法
        System.out.println("第一躺排序：");
        int temp = 0;//中间变量
        //j<arr.length-1的原因是因为，我们需要将第一个数跟第二个数比较，如果不减一，我们会一直循环到最后一个数，因为最后一个数没有下一个数，会导致数组越界
        for(int j=0;j<arr.length-1;j++){//这个地方实际上是j<arr.length-1-0，0代表了执行的第一趟序列

            if(arr[j]>arr[j+1]){
                //交换两个数，通过中间变量来交换
                temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));

        System.out.println("第二躺排序：");
        for(int j=0;j<arr.length-1-1;j++){ //1代表了执行的第二趟序列
            if(arr[j]>arr[j+1]){
                temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("第三躺排序：");
        for(int j=0;j<arr.length-1-2;j++){//2代表了执行的第三趟序列
            if(arr[j]>arr[j+1]){
                temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("第四躺排序：");
        for(int j=0;j<arr.length-1-3;j++){//3代表了执行的第四趟序列
            if(arr[j]>arr[j+1]){
                temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
