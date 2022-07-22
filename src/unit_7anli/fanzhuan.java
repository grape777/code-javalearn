package unit_7anli;

/*
需求：
已知数组，用程序把数组中元素交换
 */
public class fanzhuan {
    public static void main(String[] args) {
        //定义一个数组，分别使用静态初始化
        int[] arr = {51, 99, 65, 35, 45,};

       /* //循环遍历数组，这一次初始化语句定义两个索引变量，判断条件是开始索引小于等于结束索引
        for (int start = 0, end = arr.length-1; start <= end; start++, end--) {
            //变量交换
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }*/
        reverse(arr);
        //遍历数组
        printArray(arr);

    }

    /*
    两个明确
        返回值类型：void
        参数：int[] arr
     */
    public static void reverse(int[] arr) {
        //循环遍历数组，这一次初始化语句定义两个索引变量，判断条件是开始索引小于等于结束索引
        for (int start = 0, end = arr.length - 1; start <= end; start++, end--) {
            //变量交换
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
    }

    /*
    两个明确
        返回值类型：void
        参数：int[] arr
     */
        public static void printArray ( int[] arr){
            System.out.print("[");

            for (int x = 0; x < arr.length; x++) {
                if (x == arr.length - 1) {
                    System.out.print(arr[x]);
                } else {
                    System.out.print(arr[x] + ",");
                }
            }
            System.out.print("]");
        }
    }
