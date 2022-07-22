package unit_6method;

public class dioayong4 {
    public static void main(String[] args) {
        //在main()方法中调用定义好的方法（使用常量）
        getMax(10,20);
    }
    //定义一个方法，用于打印两个数字中的较大数，例如getMax()
    //为方法定义两个参数，用于接收两个数字
    public static void getMax(int a,int b){
        //使用分支语句分两种情况对两个数字的大小关系进行处理
        if(a > b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }
    }
}
