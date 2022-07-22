package unit_7anli;

import java.util.Scanner;

/*
需求：6个评委打分，分数为0-100的整数分，选手的最后的分为：去掉一个最高分，去掉一个最低分，剩下的平均值
 */
public class pingweidafen {
    public static void main(String[] args) {
        //定义一个数组，用动态初始化完成数组元素的初始化，长度为6
        int[] arr = new int[6];

        //键盘录入评委分数
        Scanner sc = new Scanner(System.in);
        for (int x = 0; x < arr.length; x++) {
            System.out.println("请输入第" + (x + 1) + "个评委打分");
            arr[x] = sc.nextInt();
        }
        //定义方法实现获取数组中的最高分（最大值）调用方法
        int max = getMax(arr);
        //定义方法实现获取数组中的最低分（最小值）调用方法
        int min = getMin(arr);
        //定义方法实现获取数组中的所有元素和（数组元素和）调用方法
        int sum = getSum(arr);

        //按照规则出分
        int avg = (sum - max - min) / (arr.length - 2);

        //输出
        System.out.println("最终得分为：" + avg);
    }

    /*
     两个明确：
         返回值类型：int
         参数：int[] arr
      */
    public static int getSum(int[] arr) {
        int sum = 0;
        for (int x = 0; x < arr.length; x++) {
            sum += arr[x];
        }
        return sum;
    }

    /*
       两个明确：
           返回值类型：int
           参数：int[] arr
        */
    public static int getMin(int[] arr) {
        int min = arr[0];

        for (int x = 1; x < arr.length; x++) {
            if (arr[x] < min) {
                min = arr[x];
            }
        }
        return min;
    }

    /*
       两个明确：
           返回值类型：int
           参数：int[] arr
        */
    public static int getMax(int[] arr) {
        int max = arr[0];

        for (int x = 1; x < arr.length; x++) {
            if (arr[x] > max) {
                max = arr[x];
            }
        }
        return max;
    }
}
