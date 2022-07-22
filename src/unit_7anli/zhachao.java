package unit_7anli;

import java.util.Scanner;

/*
需求：找数组中的索引值
 */
public class zhachao {
    public static void main(String[] args) {
        //定义一个数组，分别使用静态初始化
        int[] arr = {1, 8, 6, 9, 51, 24, 36, 95, 78};

        //键盘录入要查找的数据，用一个变量接收
        Scanner sc = new Scanner(System.in);

        System.out.println("输入要查找的数据");
        int number = sc.nextInt();

       /* //定义一个索引变量，初始值为-1
        int index = -1;

        //遍历数组，获取到数组中的每一个元素
        for (int x = 0; x < arr.length; x++) {
            //拿键盘录入的数组和数组中的每一个元素进行比较，如果值相同，就把该值对应的索引赋给index变量
            if (arr[x] == number) {
                index = x;
                break;
            }
        }*/
        //输出索引变量
        int index = getIndex(arr,number);
        System.out.println("index:" + index);
    }

    //查找指定的数据在数组中的索引
    /*
    两个明确：
        返回值类型：int
        参数：int[] arr ,int number
     */
    public static int getIndex(int[] arr, int number) {
        //定义一个索引变量，初始值为-1
        int index = -1;

        //遍历数组，获取到数组中的每一个元素
        for (int x = 0; x < arr.length; x++) {
            //拿键盘录入的数组和数组中的每一个元素进行比较，如果值相同，就把该值对应的索引赋给index变量
            if (arr[x] == number) {
                index = x;
                break;
            }
        }
        //返回索引
        return index;
    }
}
