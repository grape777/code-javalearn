package unit_6method;

public class Demo2 {
    public static void main(String[] args) {
        //定义一个数组，用静态初始化完成数组元素初始化
        int[] arr = {1,5,5,151,56,12,15,54,42,165,156,12,15,56,12,132,1};

        //调用获取最大值方法，用变量接受返回值结果
        int number = getMax(arr);

        //把结果输出在控制台
        System.out.println("number:"+number);

    }

    //定义一个方法，用来获取数组中最大值
    /*
        两个明确：
            返回值类型：int
            参数：int[] arr
     */
    public static int getMax(int[] arr){
        int max = arr[0];

        for (int x = 1;x < arr.length;x++){
            if (arr[x] > max){
                max = arr[x];
            }
        }
        return max;
    }
}
