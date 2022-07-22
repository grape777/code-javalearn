import java.util.Scanner;
public class shujvshuru {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        //只有sc是变量名可以变其他的都不许变
        System.out.println("请输入第一个人的高度");
        int i1 = a.nextInt();
        System.out.println("请输入第一个人的高度");
        int i2 = a.nextInt();
        System.out.println("请输入第一个人的高度");
        int i3 = a.nextInt();
        //只有i是变量名
        int max = i1 > i2 ? i1 : i2;
        int max1 = max > i3 ? max : i3;
        System.out.println("最大值为"+max1);
    }
}
