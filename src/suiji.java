import java.util.Random;
import java.util.Scanner;
public class suiji {
    public static void main(String[] args) {

        //首先要有一个要猜的数字，范围在一到一百之间
        Random r = new Random();
        int number = r.nextInt(100)+1;

        while(true){

            //每次都要输入要猜的数字，所以输入要进循环
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入你要猜的数字");
            int gn = sc.nextInt();

            //比较两个数
            if (gn > number){
                System.out.println("大了");
            }else if (gn < number){
                System.out.println("小了");
            }else{
                System.out.println("你猜中了！！！");
                break;
            }
        }
    }
}

