package unit_3fenzhiyujv;

import java.util.Scanner;
public class switchtest {
    public static void main(String[] args) {
        System.out.println("开始");

        //需求：键盘录入一个星期数，输出对应的星期
        /*Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个星期数（1-7）");
        int week = sc.nextInt();

        switch (week){
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期日");
                break;
            default:
                System.out.println("输入的星期数有误");
                break;
        }*/
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个月数（1-12）");

        int mouth = sc.nextInt();

        switch (mouth){
            case 2:
            case 3:
            case 4:
                System.out.println("春季");
                break;
            case 5:
            case 6:
            case 7:
                System.out.println("夏季");
                break;
            case 8:
            case 9:
            case 10:
                System.out.println("秋季");
                break;
            case 11:
            case 12:
            case 1:
                System.out.println("冬季");
                break;
            default:
                System.out.println("输入的月份有误");
                break;
        }
        System.out.println("结束");
    }
    
}
