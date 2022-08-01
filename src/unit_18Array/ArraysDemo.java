package unit_18Array;

/*
Arrays类包含用于操作数组的各个方法

public static String toString(int[] a)|返回指定数组的内容的字符串表示形式|
public static void sort(int[] a)|按照数字顺序排列指定的数组|
 */

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        //定义一个数组
        int[] arr = {25,61,21,95,75};

        System.out.println("排序前："+ Arrays.toString(arr));

        Arrays.sort(arr);

        System.out.println("排序后："+Arrays.toString(arr));
    }
}
