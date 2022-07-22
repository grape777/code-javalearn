package unit_7anli;

/*
需求：有这样一个数组，元素是{68，27，95，88，171，996，51，210}.求出该数组中满足要求的元素和
 */
public class sunarr {
    public static void main(String[] args) {
        //定义一个数组，用静态初始化完成数组元素的初始化
        int[] arr = {68, 27, 95, 88, 171, 996, 51, 210};

        //定义一个求和变量，初始值是0
        int sum = 0;

        //遍历数组，获取到数组中的每一个元素
        for (int x = 0; x < arr.length; x++) {
            //判断该元素是否满足条件，如果满足就累加
            if (arr[x] % 10 != 7 && arr[x] / 10 % 10 != 7 && arr[x] % 2 == 0) {
                sum += arr[x];
            }
        }
        //输出求和变量的值
        System.out.println("sun:" + sum);

    }
}
