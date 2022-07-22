package unit_9zifuchuan;

import java.util.Scanner;

public class StringTest4 {
    public static void main(String[] args) {
        //键盘录入一个字符串，用Scanner实现
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个字符串：");
        String line = sc.nextLine();

       /* //遍历字符串，首先要能够获取到字符串中的每一个字符
        System.out.println(line.charAt(0));
        System.out.println(line.charAt(1));
        System.out.println(line.charAt(2));*/

        for (int i=0;i<line.length(); i++){
            System.out.println(line.charAt(i));
        }
    }
}
