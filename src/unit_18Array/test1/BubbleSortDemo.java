package unit_18Array.test1;

import static unit_9zifuchuan.StringTest6.arrayToString;

/*
冒泡排序的代码实现
 */
public class BubbleSortDemo {
    public static void main(String[] args) {
        //定义一个数组
        int[] arr = {20, 56, 89, 12, 30};
        System.out.println("排序前：" + arrayToString(arr));

        //双重循环
        for (int x = 0; x < arr.length - 1; x++) {
            for (int i = 0; i < arr.length - 1 - x; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        System.out.println("排序后：" + arrayToString(arr));
    }


}
