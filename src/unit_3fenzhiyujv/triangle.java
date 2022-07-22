package unit_3fenzhiyujv;

import java.util.Scanner;
public class triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一条边长");
        int a = sc.nextInt();
        System.out.println("请输入第二条边长");
        int b = sc.nextInt();
        System.out.println("请输入第三条边长");
        int c = sc.nextInt();
        if(a>0&&b>0&&c>0){
            if((a+b)>c&&(a+c)>b&&(c+b)>a){
                if (a == b & b== c & a==c){
                    System.out.println("是等边三角形");
                }else if (a == b | b == c | b == c){
                    System.out.println("是等腰三角形");
                }else {
                    System.out.println("是三角形");
                }
            }else{
                System.out.println("不是三角形");
            }
        }else{
            System.out.println("边长不能小于零");
        }

    }
}
