package unit_7anli;

/*需求：
有一对兔子，从出生后第三个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问二十个月的兔子对数为多少
 */
/*规律：
从第三个数据开始，每一个数据都是前两个数据之和
第一个第二个数据是已知的

用数组模拟：
arr[0] = 1;
arr[1] = 1;
arr[2] = arr[0] + arr[1];
arr[3] = arr[1] + arr[2];
 */
public class tuzi {
    public static void main(String[] args) {
        //定义一个数组，用动态初始化完成数组元素的初始化，长度为20
        int[] arr = new int[20];

        //以为第一个月第二个月是已知的所以
        arr[0] = 1;
        arr[1] = 1;

        //用循环实现每个月的兔子对数
        for (int x = 2; x < arr.length;x++){
            arr[x] = arr[x-2] + arr[x-1];
        }
        //输出数组中最后一个元素，就是第20个月的兔子对数
        System.out.println("20个月的兔子对数为："+arr[19]);
    }
}
