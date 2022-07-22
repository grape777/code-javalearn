package unit_5shuzu;

public class HuoQuMax {
    public static void main(String[] args) {
        //定义数组
        int[] arr = {15,11,6,42,49,4,41,5,151,1,51,51,21,3,46,12,8,498,4};

        //定义一个变量，用于保存最大值
        //取数组中第一个数据作为变量的初始值
        int max = arr[0];

        //与数组中剩余的数据数个对比，每次比对将最大值保存到变量中
        for(int x =1;x < arr.length;x++ ){
            if (arr[x] > max){
                max = arr[x];
            }
        }

        //循环结束后打印变量的值
        System.out.println("max:"+max);
    }
}
